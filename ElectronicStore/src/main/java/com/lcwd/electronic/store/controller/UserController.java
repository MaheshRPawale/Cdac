package com.lcwd.electronic.store.controller;


import com.lcwd.electronic.store.dtos.ApiResponseMessage;
import com.lcwd.electronic.store.dtos.ImageResponse;
import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.UserDto;
import com.lcwd.electronic.store.services.FileService;
import com.lcwd.electronic.store.services.UserService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private  UserService userService;

    @Autowired
    private FileService fileService;

@Value("${user.profile.image.path}")
    private  String imageUploadPath;

private Logger logger= LoggerFactory.getLogger(UserController.class);
    // create
    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
    {
        UserDto user= userService.createUser(userDto);
        return  new ResponseEntity<>(user, HttpStatus.CREATED);
    }
        // update
    @PutMapping("/{userId}")//path url variable dynamic
      public ResponseEntity<UserDto> updateUser(
              @PathVariable("userId")
              String userId ,
              @Valid
              @RequestBody UserDto userDto ){

        UserDto updateUserDto = userService.updateUser(userDto, userId);
        return  new ResponseEntity<>(updateUserDto,HttpStatus.OK);
      }

      // delete
@DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponseMessage> deleteUser(
            @PathVariable String userId){
        userService.deleteUser(userId);
       ApiResponseMessage message
               =ApiResponseMessage
               .builder()
               .message("user is deleted Successfully !!")
               .success(true)
               .status(HttpStatus.OK)
               .build();
        return new ResponseEntity<>(message ,HttpStatus.OK);
    }

    //get all
    @GetMapping
    public ResponseEntity<PageableResponse<UserDto>> getAllUsers(
            @RequestParam(value = "pageNumber" ,defaultValue = "1" , required = false) int pageNumber,
            @RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize,
            @RequestParam(value = "sortBy" ,defaultValue = "name" , required = false) String sortBy,
            @RequestParam(value = "sortDir",defaultValue = "asc",required = false) String sortDir

    // defaultvalue =10 . jeva request database kade jain teva data ha 10 cha set disan
    ){

        return new ResponseEntity<>(userService.getAllUser(pageNumber,pageSize,sortBy,sortDir), HttpStatus.OK);
    }

    // get single
        @GetMapping("/{userId}")
        public ResponseEntity<UserDto> getUser(@PathVariable String userId){
        return  new ResponseEntity<>(userService.getUser(userId),HttpStatus.OK);

        }
    // get by email
    @GetMapping("/email/{email}")
    public ResponseEntity<UserDto> getUserByEmail(@PathVariable String email){
      return new ResponseEntity<>(userService.getUserByEmail(email) ,HttpStatus.OK);
    }
    // search
    @GetMapping("/search/{Keywords}")
    public ResponseEntity<List<UserDto>> searchUser(@PathVariable String Keywords){
        return new ResponseEntity<>(userService.searchUser(Keywords),HttpStatus.OK);
    }

    //upload user image

    @PostMapping("/image/{userId}")
        public ResponseEntity<ImageResponse> uploadUserImage(@RequestParam("userImage")MultipartFile image, @PathVariable String userId) throws IOException {
       String imageName= fileService.uploaadFile(image , imageUploadPath);

      UserDto  user=userService.getUser(userId);
      user.setImageName(imageName);
     UserDto userDto= userService.updateUser(user,userId);

        ImageResponse imageResponse=ImageResponse.builder().ImageName(imageName).success(true).status(HttpStatus.CREATED).build();
        return new ResponseEntity<>(imageResponse ,HttpStatus.CREATED);


    }



    // serve user image( send img id and get img)

    @GetMapping("/image/{userId}")
        public void serveUserImage(@PathVariable String userId, HttpServletResponse response) throws IOException {

        UserDto user= userService.getUser(userId);
        logger.info("User image name : {}",user.getImageName()); // ya mule user image konti aahe te samajan
        InputStream resource=fileService.getResource(imageUploadPath,user.getImageName());

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(resource, response.getOutputStream());

    }


}

package com.lcwd.electronic.store.services.impl;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.UserDto;
import com.lcwd.electronic.store.entities.User;
import com.lcwd.electronic.store.exceptions.ResourceNotFoundException;
import com.lcwd.electronic.store.helper.Helper;
import com.lcwd.electronic.store.repositries.UserRepository;
import com.lcwd.electronic.store.services.UserService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.module.ResolutionException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Value("${user.profile.image.path}")
    private  String imagePath;

    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public UserDto createUser(UserDto userDto) {

        //generate unique id in string format
            String userId= UUID.randomUUID().toString();
            userDto.setUserId(userId);

    // dto ----> entity
        User user =dtoToEntity(userDto);
      User savedUser=  userRepository.save(user);

    // entity ---> dto
    UserDto newDto=entityToDto(savedUser);
    return  newDto;

    }


    @Override
    public UserDto updateUser(UserDto userDto, String userID) {

    User user=userRepository.findById(userID).orElseThrow(() -> new ResolutionException());

    user.setName(userDto.getName());

    user.setAbout(userDto.getAbout());
    user.setGender(userDto.getGender());
    user.setPassword(userDto.getPassword());
    user.setImageName(userDto.getImageName());

    // save data
        User updatedUser = userRepository.save(user);
        UserDto updateDto= entityToDto(updatedUser);

        return updateDto;
    }

    @Override
    public void deleteUser(String userId) {

        User user=userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());

     //delete user profile image
        //images/users/abc.png
    String fullPath=imagePath+user.getImageName();

       try {
           Path path= Paths.get(fullPath);
           Files.delete(path);
       }
       catch (NoSuchFileException ex){
            logger.info("User image not found in folder " );
            ex.printStackTrace();
       } catch (IOException e) {
            e.printStackTrace();
       }


        //  delete userrr



        userRepository.delete(user);
    }

    @Override
    public PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize , String sortBy , String sortDir) {

       Sort sort= (sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()):(Sort.by(sortBy).ascending());

        Pageable pageable = PageRequest.of(pageNumber-1,pageSize ,sort);
        // pageNUmber default start from=0

        Page<User> page = userRepository.findAll(pageable);
       PageableResponse <UserDto> response= Helper.getpageableResponse(page,UserDto.class);

     return response;
    }

    @Override
    public UserDto getUser(String userId) {
      // in project getUserById ani my project  getUser he same name aahe.

     User user=  userRepository.findById(userId).orElseThrow(() ->new ResourceNotFoundException("user not found with given id !!"));
       return entityToDto(user);
    }

    @Override
    public UserDto getUserByEmail(String email) {
       User user= userRepository.findByEmail(email).orElseThrow(() ->new ResourceNotFoundException("User not found with given email id  !!"));

        return entityToDto(user);
    }

    @Override
    public List<UserDto> searchUser(String Keyword) {

    List<User> users= userRepository.findByNameContaining(Keyword);
    List<UserDto> dtoList=users.stream().map(user -> entityToDto(user)).collect(Collectors.toList());

        return dtoList ;
    }

    private UserDto entityToDto(User savedUser)
    {    // mapping aahe
       /* UserDto userDto=UserDto.builder()
                .userId(savedUser.getUserId())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .password(savedUser.getPassword())
                .about(savedUser.getAbout())
                .gender(savedUser.getGender())
                .imageName(savedUser.getImageName())
                .build();*/


        return mapper.map(savedUser,UserDto.class);
    }

    private User dtoToEntity(UserDto userDto)
    {
//        User user= User.builder()
//                .userId(userDto.getUserId())
//                .name(userDto.getName())
//                .email(userDto.getEmail())
//                .password(userDto.getPassword())
//                .about(userDto.getAbout())
//                .gender(userDto.getGender())
//                .imageName(userDto.getImageName())
//                .build();


        return mapper.map(userDto, User.class);

    }

}

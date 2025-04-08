package com.lcwd.electronic.store.dtos;


import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDto {

    // this help to send a data conroller to service
    // entity store data in service

    private  String userId;
    @Size(min = 3, max = 15 ,message = "Invalid Name!!")
    private String name;
    //@Email(message = "Invalid user Email !!")

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email format")
    @NotBlank(message = "Email is required !!")
    private String email;
    @NotBlank(message ="Password is required ")
    private String password;

    @Size(min = 4,max = 6,message = "Invalid Gender")
    private  String gender;

    @NotBlank(message = "Write something about yourself !!")
        private String about;
    @ImageNameValid
        private String imageName;

}

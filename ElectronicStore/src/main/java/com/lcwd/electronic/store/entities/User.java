package com.lcwd.electronic.store.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "users")

public class User {

    @Id

    private String userId;

    @Column(name = "user_name") // he column cha name aahe
    private String name;

   @Column(name = "user_email" ,  unique = true )
    private String email;


   @Column(name = "user_password", length = 10)
   private String password;

    private String  gender;

    @Column(length = 1000)
    private String about;


    @Column(name = "user_image_name") // database madhe he name save hoin
    private String imageName;


}

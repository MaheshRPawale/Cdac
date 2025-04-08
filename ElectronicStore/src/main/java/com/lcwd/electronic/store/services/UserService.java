package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.UserDto;
import com.lcwd.electronic.store.entities.User;

import java.util.List;

public interface UserService
{
    // create

    UserDto createUser(UserDto userDto);

    // update
    UserDto updateUser(UserDto userDto, String userID);

    // delete

    void deleteUser(String userId);

    // get all users
    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);

    // get single user by id

    UserDto getUser(String userId);

    // get single user ny email
    UserDto getUserByEmail(String email);

    //search user

    List<UserDto> searchUser(String Keyword);



    // create
    /* void createUser(User user)
       User createUser(User  user);
     in this method create one method Frist User is cls and user datatype

     User createUser(User user)
     in this return type User ka getla karan ha User cha data User la send karaycha aahe ani controller la pan .
     jr ha data dusrya entity la send karaycha asta tr tya entity cha name getl ast.
    */
}

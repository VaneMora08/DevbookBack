package com.devbook.formattech.service;

import com.devbook.formattech.Dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser (UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(int id);
    UserDto updateUser(int id, UserDto userDto);
    void deleteUser(int id);


}

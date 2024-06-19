package com.devbook.formattech.converter;

import com.devbook.formattech.Dto.UserDto;
import com.devbook.formattech.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {

    public static UserDto userDto (User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setSurname(user.getSurname());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setPhone(user.getPhone());
        userDto.setDateOfBirth(user.getDateOfBirth());
        return userDto;
    }

    public static User user (UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());
        user.setDateOfBirth(userDto.getDateOfBirth());
        return user;

    }

}

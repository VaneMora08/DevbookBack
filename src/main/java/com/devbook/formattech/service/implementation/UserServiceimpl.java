package com.devbook.formattech.service.implementation;

import com.devbook.formattech.Dto.UserDto;
import com.devbook.formattech.converter.UserMapper;
import com.devbook.formattech.entity.User;
import com.devbook.formattech.exceptions.ResourceNotFoundException;
import com.devbook.formattech.repository.UserRepository;
import com.devbook.formattech.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceimpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceimpl.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.user(userDto);
        user = userRepository.save(user);
        return userMapper.userDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserMapper::userDto).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public UserDto getUserById(int id) {
        return userRepository.findById(id)
                .map(UserMapper::userDto)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @Override
    public UserDto updateUser(int id, UserDto userDto) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        existingUser.setUsername(userDto.getUsername());
        User updatedUser = userRepository.save(existingUser);
        return userMapper.userDto(updatedUser);
    }

    @Override
    public void deleteUser(int id) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        userRepository.delete(existingUser);
    }





}

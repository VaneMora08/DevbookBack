package com.devbook.formattech.service;

import com.devbook.formattech.Dto.UserProfileDto;

import java.util.List;

public interface UserProfileService {
  UserProfileDto createUserProfile(UserProfileDto userProfileDto);

  List<UserProfileDto> getAllUsersProfiles();

  UserProfileDto getUserProfileById(int id);

  UserProfileDto updateUserProfile(int id, UserProfileDto userProfileDto);

  void deleteUserProfile(int id);
}

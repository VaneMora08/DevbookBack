package com.devbook.formattech.service;

import com.devbook.formattech.Dto.FriendShipDto;

import java.util.List;

public interface FriendShipService {
  FriendShipDto createFriendShip(FriendShipDto friendShipDto);

  List<FriendShipDto> getAllFriendShips();

  FriendShipDto getFriendShipById(int id);

  FriendShipDto updateFriendShip(int id, FriendShipDto friendShipDto);

  void deleteFriendShip(int id);
}

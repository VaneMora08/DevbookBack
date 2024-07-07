package com.devbook.formattech.controller;


import com.devbook.formattech.Dto.FriendShipDto;
import com.devbook.formattech.service.FriendShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/friendShip")
public class FriendShipController {

  @Autowired
  FriendShipService friendShipService;

  @PostMapping
  public ResponseEntity<FriendShipDto> createFriendShip(@RequestBody FriendShipDto friendShipDto) {
    FriendShipDto friendShip = friendShipService.createFriendShip(friendShipDto);
    return  ResponseEntity.ok(friendShip);
  }

  @GetMapping("/getFriendShips")
  public ResponseEntity<List<FriendShipDto>> getFriendShips() {
    List<FriendShipDto> friendShips = friendShipService.getAllFriendShips();
    return ResponseEntity.ok(friendShips);
  }

  @GetMapping("/{id}")
  public ResponseEntity<FriendShipDto> getFriendShipById(@PathVariable int id) {
    FriendShipDto friendship = friendShipService.getFriendShipById(id);
    return ResponseEntity.ok(friendship);
  }

  @PutMapping("/{id}")
  public ResponseEntity<FriendShipDto>  updateFriendShip(@PathVariable int id, @RequestBody  FriendShipDto friendShipDto) {
    FriendShipDto updatedFriendShip = friendShipService.updateFriendShip(id, friendShipDto);
    return ResponseEntity.ok(updatedFriendShip);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteFriendShip(@PathVariable int id) {
    friendShipService.deleteFriendShip(id);
    return ResponseEntity.noContent().build();
  }
}

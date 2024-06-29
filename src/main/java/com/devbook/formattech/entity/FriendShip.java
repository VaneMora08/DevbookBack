package com.devbook.formattech.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "friendShip")
public class FriendShip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String status;
//    @Timestamp
//    private Date created_at;
//    @Timestamp
//    private Date updated_at;
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "friend_id", nullable = false)
//    private User user;
//      como colocar el constraints

}

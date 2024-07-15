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
@Table(name = "userProfile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String bio;
    private String profile_picture_url;
//    @Timestamp
//    private Date created_at;
//    @Timestamp
//    private Date updated_at;
//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
}

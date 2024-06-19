package com.devbook.formattech.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rol;


//    @ManyToMany
//    @JoinTable(name = "user_id")
//    private Set<User> user = new HashSet<>();
}

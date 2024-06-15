package com.devbook.formattech.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String username;
    private String surname;
    private String email;
    private String password;
    private Long phone;
    private Date dateOfBirth;
    @Timestamp
    private Date created_at;
    @Timestamp
    private Date updated_at;
    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "gender_id", nullable = false)
    private Gender gender;

    @ManyToMany
    @JoinTable(name = "rol_id")
    private Set <Rol> rol = new HashSet<>();


    @ManyToMany
    @JoinTable(name = "stack_id")
    private  Set <Stack> stack = new HashSet<>();

}

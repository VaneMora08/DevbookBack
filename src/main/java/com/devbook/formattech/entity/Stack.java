package com.devbook.formattech.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "stack")
public class Stack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;

}

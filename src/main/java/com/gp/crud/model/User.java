package com.gp.crud.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "TestUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}


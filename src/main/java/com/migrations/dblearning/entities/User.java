package com.migrations.dblearning.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email") private String email;
    @Column(name = "password") private String password;
    @Column(name = "created_at") private Date createdAt;

    @Column(name = "username") private String username;
}

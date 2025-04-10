package com.core_service.core_service.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name = "";
    public String email = "";
}

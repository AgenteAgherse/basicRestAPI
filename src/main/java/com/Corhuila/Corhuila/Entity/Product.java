package com.Corhuila.Corhuila.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/*
- id: BIGINT (primary key, auto-incremental)
- name: VARCHAR(50)
- description: TEXT
* */
@Entity
@Table(name = "product_1075319070")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String description;

    @Column(length = 100)
    private String state;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private LocalDateTime deleted_at;
}

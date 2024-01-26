package com.Corhuila.Corhuila.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer_product_1075319070")
@Data
/*
- id: BIGINT (primary key, auto-incremental)
- customer_id: BIGINT (foreign key)
- product_id: BIGINT (foreign key, unique constraint)
- balance: DECIMAL(10,2)
 */
public class CustomerProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customer_id;
    private Integer product_id;

    @Column(name = "balance", nullable = false)
    private Double balance;

    @Column(length = 100)
    private String status;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;

    private LocalDateTime deleted_at;
}

package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int phone;

    @OneToMany(mappedBy = "userId")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "userId")
    private List<Payment> payments;

    @Column(name = "created_at")
    private Timestamp createdAt;
}

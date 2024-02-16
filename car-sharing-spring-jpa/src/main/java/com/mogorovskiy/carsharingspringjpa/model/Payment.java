package com.mogorovskiy.carsharingspringjpa.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.*;
import java.sql.*;

@Entity
@Getter
@Setter
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @Column(name = "cash_amount")
    private BigDecimal cashAmount;

    @Column(name = "created_at")
    private Timestamp createdAt;
}

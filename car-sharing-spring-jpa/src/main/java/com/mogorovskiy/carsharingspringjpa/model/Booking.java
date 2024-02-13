package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.*;

@Entity
@Getter
@Setter
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Long carId;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Long paymentId;

    @Column(name = "starting_at")
    private Timestamp startingAt;

    @Column(name = "ending_at")
    private Timestamp endingAt;
}

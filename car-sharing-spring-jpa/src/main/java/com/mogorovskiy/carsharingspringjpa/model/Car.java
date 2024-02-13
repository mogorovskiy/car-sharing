package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String mark;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private int mileage;

    @Column(nullable = false)
    private String licensePlate;

    @Column(nullable = false)
    private Long geo;
}

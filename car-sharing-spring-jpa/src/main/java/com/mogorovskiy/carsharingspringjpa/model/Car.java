package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String mark;

    private Integer year;

    private Long mileage;

    @Column(name = "licence_plate")
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "geo_id")
    private Geolocation geo;

    @OneToMany(mappedBy = "car")
    private List<Booking> bookings;
}

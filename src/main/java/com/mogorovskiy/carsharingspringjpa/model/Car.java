package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

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

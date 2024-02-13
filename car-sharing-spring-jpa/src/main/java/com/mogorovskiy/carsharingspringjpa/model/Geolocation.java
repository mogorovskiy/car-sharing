package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Geolocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private float latitude;

    @Column(nullable = false)
    private float longitude;
}

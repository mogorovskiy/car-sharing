package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "geo")
public class Geolocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float latitude;

    private Float longitude;

    @OneToMany(mappedBy = "geo")
    private List<Car> cars;
}

package com.mogorovskiy.carsharingspringjpa.dto;

import com.mogorovskiy.carsharingspringjpa.model.Geolocation;
import lombok.Data;

@Data
public class CarRequestDto {
    private String model;
    private String mark;
    private int year;
    private Long mileage;
    private String licensePlate;
    private Geolocation geo;
}

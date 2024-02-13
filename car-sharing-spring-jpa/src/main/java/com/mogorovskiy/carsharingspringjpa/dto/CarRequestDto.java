package com.mogorovskiy.carsharingspringjpa.dto;

import com.mogorovskiy.carsharingspringjpa.model.*;
import lombok.*;

@Data
public class CarRequestDto {
    private String model;
    private String mark;
    private int year;
    private Long mileage;
    private String licensePlate;
    private Geolocation geo;
}

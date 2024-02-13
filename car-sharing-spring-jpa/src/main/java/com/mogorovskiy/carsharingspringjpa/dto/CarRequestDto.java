package com.mogorovskiy.carsharingspringjpa.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
public class CarRequestDto {
    private String model;
    private String mark;
    private int year;
    private int mileage;
    private String licensePlate;
    private Long geo;
}

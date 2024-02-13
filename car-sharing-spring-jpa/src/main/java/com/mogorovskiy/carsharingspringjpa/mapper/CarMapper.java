package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import org.hibernate.annotations.*;
import org.springframework.stereotype.*;

@Service
public class CarMapper {
    public Car toModel(CarRequestDto carRequestDto) {
        Car car = new Car();
        car.setModel(carRequestDto.getModel());
        car.setGeo(carRequestDto.getGeo());
        car.setMark(carRequestDto.getMark());
        car.setYear(carRequestDto.getYear());
        car.setMileage(carRequestDto.getMileage());
        car.setLicensePlate(carRequestDto.getLicensePlate());
        return car;
    }
}

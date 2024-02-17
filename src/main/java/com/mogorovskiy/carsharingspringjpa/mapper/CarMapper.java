package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.CarRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Car;
import org.springframework.stereotype.Service;

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

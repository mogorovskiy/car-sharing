package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.CarRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Car;
import java.util.List;

public interface CarService {
    Car addCar(CarRequestDto carRequestDto);

    List<Car> getAllCars();

    Car getCarById(Long carId);

    void deleteCar(Long carId);
}

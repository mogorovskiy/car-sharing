package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;

import java.util.*;

public interface CarService {
    Car addCar(CarRequestDto carRequestDto);

    List<Car> getAllCars();

    Car getCarById(Long carId);

    void deleteCar(Long carId);
}

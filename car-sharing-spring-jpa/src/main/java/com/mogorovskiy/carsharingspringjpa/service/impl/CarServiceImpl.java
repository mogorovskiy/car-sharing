package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.mapper.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.repository.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public Car addCar(CarRequestDto carRequestDto) {
        Car car = carMapper.toModel(carRequestDto);
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long carId) {
        Optional<Car> carOptional = carRepository.findById(carId);
        return carOptional.orElse(null);
    }

    @Override
    public void deleteCar(Long carId) {
        carRepository.deleteById(carId);
    }
}

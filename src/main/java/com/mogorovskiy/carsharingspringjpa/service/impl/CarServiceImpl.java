package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.CarRequestDto;
import com.mogorovskiy.carsharingspringjpa.mapper.CarMapper;
import com.mogorovskiy.carsharingspringjpa.model.Car;
import com.mogorovskiy.carsharingspringjpa.repository.CarRepository;
import com.mogorovskiy.carsharingspringjpa.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

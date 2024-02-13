package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    @PostMapping("/add")
    public Car add(@RequestBody CarRequestDto carRequestDto) {
        log.info("Car add: " + carRequestDto);
        return carService.addCar(carRequestDto);
    }

    @GetMapping("/getAll")
    public List<Car> getAll() {
        log.info("Cars, getAll: ");
        return carService.getAllCars();
    }

    @GetMapping("/{carId}")
    public Car getById(@PathVariable Long carId) {
        return carService.getCarById(carId);
    }

    @DeleteMapping("/{carId}")
    public void delete(@PathVariable Long carId) {
        carService.deleteCar(carId);
    }
}

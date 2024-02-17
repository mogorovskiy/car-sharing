package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.controller.*;
import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarControllerTest {

    @Mock
    private CarService carService;

    @InjectMocks
    private CarController carController;

    @Test
    void testAddCar() {
        CarRequestDto carRequestDto = new CarRequestDto();
        carRequestDto.setModel("Toyota");
        carRequestDto.setMark("Land Cruiser 400");
        Car car = new Car();
        car.setId(1L);
        car.setModel("Toyota");
        car.setMark("Land Cruiser 400");
        when(carService.addCar(carRequestDto)).thenReturn(car);
        Car result = carController.add(carRequestDto);
        assertEquals(car, result);
    }

    @Test
    void testGetAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        when(carService.getAllCars()).thenReturn(cars);
        List<Car> result = carController.getAll();
        assertEquals(2, result.size());
    }

    @Test
    void testGetCarById() {
        Long carId = 1L;
        Car car = new Car();
        car.setId(carId);
        when(carService.getCarById(carId)).thenReturn(car);
        Car result = carController.getById(carId);
        assertEquals(carId, result.getId());
    }
}
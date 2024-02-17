package com.mogorovskiy.carsharingspringjpa.repository;

import com.mogorovskiy.carsharingspringjpa.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}

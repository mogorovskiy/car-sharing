package com.mogorovskiy.carsharingspringjpa.repository;

import com.mogorovskiy.carsharingspringjpa.model.Geolocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeolocationRepository extends JpaRepository<Geolocation, Long> {
}

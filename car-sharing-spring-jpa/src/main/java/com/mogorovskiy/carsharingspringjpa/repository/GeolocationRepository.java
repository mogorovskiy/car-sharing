package com.mogorovskiy.carsharingspringjpa.repository;

import com.mogorovskiy.carsharingspringjpa.model.*;
import org.springframework.data.jpa.repository.*;

public interface GeolocationRepository extends JpaRepository<Geolocation, Long> {
}

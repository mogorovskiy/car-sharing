package com.mogorovskiy.carsharingspringjpa.repository;

import com.mogorovskiy.carsharingspringjpa.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCarIdAndStartingAtLessThanEqualAndEndingAtGreaterThanEqual(Long carId, Timestamp startDate, Timestamp endDate);
}
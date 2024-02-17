package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.BookingRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Booking;
import java.sql.Timestamp;
import java.util.List;

public interface BookingService {
    Booking addBooking(BookingRequestDto bookingRequestDto);

    List<Booking> getAllBookings();

    Booking getBookingById(Long bookingId);

    void deleteBooking(Long bookingId);

    boolean isCarAvailableForBooking(Long carId, Timestamp startingAt, Timestamp endingAt);
}

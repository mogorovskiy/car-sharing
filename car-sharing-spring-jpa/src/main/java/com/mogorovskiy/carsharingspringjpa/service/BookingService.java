package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;

import java.util.*;

public interface BookingService {
    Booking addBooking(BookingRequestDto bookingRequestDto);

    List<Booking> getAllBookings();

    Booking getBookingById(Long bookingId);

    void deleteBooking(Long bookingId);
}

package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import org.springframework.stereotype.*;

@Service
public class BookingMapper {
    public Booking toModel(BookingRequestDto bookingRequestDto) {
        Booking booking = new Booking();
        booking.setCarId(bookingRequestDto.getCar());
        booking.setUserId(bookingRequestDto.getUser());
        booking.setPaymentId(bookingRequestDto.getPayment());
        booking.setStartingAt(bookingRequestDto.getStartingAt());
        booking.setEndingAt(bookingRequestDto.getEndingAt());
        return booking;
    }
}

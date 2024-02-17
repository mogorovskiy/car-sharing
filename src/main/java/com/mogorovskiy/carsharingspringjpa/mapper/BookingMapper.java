package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.BookingRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Booking;
import com.mogorovskiy.carsharingspringjpa.service.CarService;
import com.mogorovskiy.carsharingspringjpa.service.PaymentService;
import com.mogorovskiy.carsharingspringjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingMapper {
    private final UserService userService;
    private final CarService carService;
    private final PaymentService paymentService;

    public Booking toModel(BookingRequestDto bookingRequestDto) {
        Booking booking = new Booking();
        booking.setUser(userService.getUserById(bookingRequestDto.getUserId()));
        booking.setCar(carService.getCarById(bookingRequestDto.getCarId()));
        booking.setPayment(paymentService.getPaymentById(bookingRequestDto.getPaymentId()));
        booking.setStartingAt(bookingRequestDto.getStartingAt());
        booking.setEndingAt(bookingRequestDto.getEndingAt());
        return booking;
    }
}

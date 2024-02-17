package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookingControllerTest {
    @Mock
    private BookingService bookingService;

    @InjectMocks
    private BookingController bookingController;

    @Test
    void testAddBooking() {
        BookingRequestDto bookingRequestDto = new BookingRequestDto();
        bookingRequestDto.setCarId(1L);
        bookingRequestDto.setStartingAt(new Timestamp(System.currentTimeMillis()));
        bookingRequestDto.setEndingAt(new Timestamp(System.currentTimeMillis() + 3600000));
        when(bookingService.isCarAvailableForBooking(1L, bookingRequestDto.getStartingAt(), bookingRequestDto.getEndingAt())).thenReturn(true);
        Booking booking = new Booking();
        booking.setId(1L);
        when(bookingService.addBooking(bookingRequestDto)).thenReturn(booking);
        Object result = bookingController.add(bookingRequestDto);
        assertEquals(booking, result);
    }

    @Test
    void testGetAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking());
        bookings.add(new Booking());
        when(bookingService.getAllBookings()).thenReturn(bookings);
        List<Booking> result = bookingController.getAll();
        assertEquals(2, result.size());
    }

    @Test
    void testGetBookingById() {
        Long bookingId = 1L;
        Booking booking = new Booking();
        booking.setId(bookingId);
        when(bookingService.getBookingById(bookingId)).thenReturn(booking);
        Booking result = bookingController.getById(bookingId);
        assertEquals(bookingId, result.getId());
    }
}
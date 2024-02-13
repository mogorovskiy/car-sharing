package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    @PostMapping("/add")
    public Booking add(@RequestBody BookingRequestDto bookingRequestDto) {
        return bookingService.addBooking(bookingRequestDto);
    }

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getById(@PathVariable Long bookingId) {
        return bookingService.getBookingById(bookingId);
    }

    @DeleteMapping("/{bookingId}")
    public void delete(@PathVariable Long bookingId) {
        bookingService.deleteBooking(bookingId);
    }
}
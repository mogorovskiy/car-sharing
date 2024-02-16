package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    @PostMapping("/add")
    public Booking add(@RequestBody BookingRequestDto bookingRequestDto) {
        log.info("Booking add: " + bookingRequestDto);
        return bookingService.addBooking(bookingRequestDto);
    }

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        log.info("Booking, getAll: ");
        return bookingService.getAllBookings();
    }

    @GetMapping("/{bookingId}")
    public Booking getById(@PathVariable Long bookingId) {
        log.info("Booking, get by id: ");
        return bookingService.getBookingById(bookingId);
    }

    @DeleteMapping("/{bookingId}")
    public void delete(@PathVariable Long bookingId) {
        log.info("Delete booking: {}", bookingId);
        bookingService.deleteBooking(bookingId);
    }
}
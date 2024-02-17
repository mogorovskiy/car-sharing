package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.BookingRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Booking;
import com.mogorovskiy.carsharingspringjpa.service.BookingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService bookingService;

    @PostMapping("/add")
    public Object add(@RequestBody BookingRequestDto bookingRequestDto) {
        log.info("Booking add: {}", bookingRequestDto);
        if (!bookingService.isCarAvailableForBooking(bookingRequestDto.getCarId(),
                bookingRequestDto.getStartingAt(),
                bookingRequestDto.getEndingAt())) {
            return ResponseEntity.badRequest().body("Car is not available for booking at the requested time.");
        }
        Booking booking = bookingService.addBooking(bookingRequestDto);
        return booking;
    }

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        log.info("Booking, getAll: ");
        return bookingService.getAllBookings();
    }

    @GetMapping("/getById/{bookingId}")
    public Booking getById(@PathVariable Long bookingId) {
        log.info("Booking, get by id: ");
        return bookingService.getBookingById(bookingId);
    }

    @DeleteMapping("/delete/{bookingId}")
    public void delete(@PathVariable Long bookingId) {
        log.info("Delete booking: {}", bookingId);
        bookingService.deleteBooking(bookingId);
    }
}
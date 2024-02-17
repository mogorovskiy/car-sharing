package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.BookingRequestDto;
import com.mogorovskiy.carsharingspringjpa.mapper.BookingMapper;
import com.mogorovskiy.carsharingspringjpa.model.Booking;
import com.mogorovskiy.carsharingspringjpa.repository.BookingRepository;
import com.mogorovskiy.carsharingspringjpa.service.BookingService;
import com.mogorovskiy.carsharingspringjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final UserService userService;
    private final BookingMapper bookingMapper;

    @Override
    public Booking addBooking(BookingRequestDto bookingRequestDto) {
        Booking booking = bookingMapper.toModel(bookingRequestDto);
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long bookingId) {
        Optional<Booking> bookingOptional = bookingRepository.findById(bookingId);
        return bookingOptional.orElse(null);
    }

    @Override
    public void deleteBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    @Override
    public boolean isCarAvailableForBooking(Long carId, Timestamp startingAt, Timestamp endingAt) {
        List<Booking> bookings = bookingRepository.findByCarIdAndStartingAtLessThanEqualAndEndingAtGreaterThanEqual(carId, startingAt, endingAt);
        return bookings.isEmpty();
    }
}

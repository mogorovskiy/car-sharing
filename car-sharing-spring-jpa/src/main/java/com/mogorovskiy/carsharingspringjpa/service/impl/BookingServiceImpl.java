package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.mapper.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.repository.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
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
}

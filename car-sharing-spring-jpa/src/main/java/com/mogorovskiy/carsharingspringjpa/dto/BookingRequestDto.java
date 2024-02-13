package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.*;

import java.time.*;

@Data
public class BookingRequestDto {
    private Long userId;
    private Long carId;
    private Long paymentId;
    private LocalDateTime startingAt;
    private LocalDateTime endingAt;
}

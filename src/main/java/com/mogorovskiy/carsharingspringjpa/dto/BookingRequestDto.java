package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class BookingRequestDto {
    private Long userId;
    private Long carId;
    private Long paymentId;
    private Timestamp startingAt;
    private Timestamp endingAt;
}

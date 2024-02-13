package com.mogorovskiy.carsharingspringjpa.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Data
public class PaymentRequestDto {
    private Long userId;
    private Long cashAmount;
    private LocalDateTime createdAt;
}

package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class PaymentRequestDto {
    private Long userId;
    private BigDecimal cashAmount;
    private Timestamp createdAt;
}

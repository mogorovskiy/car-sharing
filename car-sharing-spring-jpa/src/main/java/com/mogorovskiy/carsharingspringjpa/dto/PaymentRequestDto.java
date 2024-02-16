package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.*;

import java.math.*;
import java.sql.*;

@Data
public class PaymentRequestDto {
    private Long userId;
    private BigDecimal cashAmount;
    private Timestamp createdAt;
}

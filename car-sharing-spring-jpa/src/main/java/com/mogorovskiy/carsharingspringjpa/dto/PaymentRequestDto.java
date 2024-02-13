package com.mogorovskiy.carsharingspringjpa.dto;

import com.mogorovskiy.carsharingspringjpa.model.*;
import lombok.*;

import java.math.*;
import java.sql.*;

@Data
public class PaymentRequestDto {
    private Long user;
    private BigDecimal cashAmount;
    private Timestamp createdAt;
}

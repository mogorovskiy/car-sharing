package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.*;

import java.sql.*;

@Data
public class BookingRequestDto {
    private Long user;
    private Long car;
    private Long payment;
    private Timestamp startingAt;
    private Timestamp endingAt;
}

package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.*;

import java.sql.*;

@Data
public class UserRequestDto {
    private String name;
    private String email;
    private int phone;
    private Timestamp createdAt;
}

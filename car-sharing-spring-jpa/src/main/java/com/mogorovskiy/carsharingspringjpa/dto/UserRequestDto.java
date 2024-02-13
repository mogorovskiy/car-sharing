package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.*;

import java.time.*;

@Data
public class UserRequestDto {
    private String name;
    private String email;
    private int phone;
    private LocalDateTime createdAt;
}

package com.mogorovskiy.carsharingspringjpa.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class UserRequestDto {
    private String name;
    private String email;
    private int phone;
    private Timestamp createdAt;
}

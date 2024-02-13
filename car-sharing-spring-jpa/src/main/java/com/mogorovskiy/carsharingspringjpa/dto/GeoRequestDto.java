package com.mogorovskiy.carsharingspringjpa.dto;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.*;

@Data
public class GeoRequestDto {
    private float latitude;
    private float longitude;
}

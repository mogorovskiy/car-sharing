package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.*;

import java.time.*;

@Entity
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long carId;

    @Column(nullable = false)
    private Long paymentId;

    @Column(nullable = false)
    private LocalDateTime startingAt;

    @Column(nullable = false)
    private LocalDateTime endingAt;
}

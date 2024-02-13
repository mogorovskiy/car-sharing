package com.mogorovskiy.carsharingspringjpa.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.*;

import javax.print.attribute.standard.*;
import java.time.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int phone;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}

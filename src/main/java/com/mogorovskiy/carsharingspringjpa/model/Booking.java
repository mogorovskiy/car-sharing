package com.mogorovskiy.carsharingspringjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    @JsonIgnore
    private Car car;

    @OneToOne
    @JoinColumn(name = "payment_id")
    @JsonIgnore
    private Payment payment;

    @Column(name = "starting_at")
    private Timestamp startingAt;

    @Column(name = "ending_at")
    private Timestamp endingAt;
}

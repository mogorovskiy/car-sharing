package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import org.springframework.stereotype.*;

@Service
public class PaymentMapper {
    public Payment toModel(PaymentRequestDto paymentRequestDto) {
        Payment payment = new Payment();
        payment.setCashAmount(paymentRequestDto.getCashAmount());
        payment.setCreatedAt(paymentRequestDto.getCreatedAt());
        return payment;
    }
}

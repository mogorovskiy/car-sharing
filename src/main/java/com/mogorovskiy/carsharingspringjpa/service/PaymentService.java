package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.PaymentRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Payment;
import java.util.List;

public interface PaymentService {
    Payment addPayment(PaymentRequestDto paymentRequestDto);

    List<Payment> getAllPayments();

    Payment getPaymentById(Long paymentId);

    void deletePayment(Long paymentId);
}

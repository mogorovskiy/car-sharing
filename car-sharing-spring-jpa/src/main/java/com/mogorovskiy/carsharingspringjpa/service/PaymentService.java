package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;

import java.util.*;

public interface PaymentService {
    Payment addPayment(PaymentRequestDto paymentRequestDto);

    List<Payment> getAllPayments();

    Payment getPaymentById(Long paymentId);

    void deletePayment(Long paymentId);
}

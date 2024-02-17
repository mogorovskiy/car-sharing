package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.controller.*;
import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PaymentControllerTest {
    @Mock
    private PaymentService paymentService;

    @InjectMocks
    private PaymentController paymentController;

    @Test
    void testAddPayment() {
        PaymentRequestDto paymentRequestDto = new PaymentRequestDto();
        paymentRequestDto.setCashAmount(BigDecimal.valueOf(100));
        Payment payment = new Payment();
        payment.setId(1L);
        payment.setCashAmount(BigDecimal.valueOf(100));
        when(paymentService.addPayment(paymentRequestDto)).thenReturn(payment);
        Payment result = paymentController.add(paymentRequestDto);
        assertEquals(payment, result);
    }

    @Test
    void testGetAllPayments() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment());
        payments.add(new Payment());
        when(paymentService.getAllPayments()).thenReturn(payments);
        List<Payment> result = paymentController.getAll();
        assertEquals(2, result.size());
    }

    @Test
    void testGetPaymentById() {
        Long paymentId = 1L;
        Payment payment = new Payment();
        payment.setId(paymentId);
        when(paymentService.getPaymentById(paymentId)).thenReturn(payment);
        Payment result = paymentController.getById(paymentId);
        assertEquals(paymentId, result.getId());
    }

    @Test
    void testDeletePayment() {
        Long paymentId = 1L;
        paymentController.delete(paymentId);
        verify(paymentService, times(1)).deletePayment(paymentId);
    }
}
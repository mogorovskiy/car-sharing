package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/add")
    public Payment add(@RequestBody PaymentRequestDto paymentRequestDto) {
        return paymentService.addPayment(paymentRequestDto);
    }

    @GetMapping("/getAll")
    public List<Payment> getAll() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{paymentId}")
    public Payment getById(@PathVariable Long paymentId) {
        return paymentService.getPaymentById(paymentId);
    }

    @DeleteMapping("/delete/{paymentId}")
    public void delete(@PathVariable Long paymentId) {
        paymentService.deletePayment(paymentId);
    }
}

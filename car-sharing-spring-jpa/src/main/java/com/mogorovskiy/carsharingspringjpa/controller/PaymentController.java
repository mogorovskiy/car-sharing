package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/add")
    public Payment add(@RequestBody PaymentRequestDto paymentRequestDto) {
        log.info("Payment add :{}", paymentRequestDto);
        return paymentService.addPayment(paymentRequestDto);
    }

    @GetMapping("/getAll")
    public List<Payment> getAll() {
        log.info("Payment getAll :");
        return paymentService.getAllPayments();
    }

    @GetMapping("/{paymentId}")
    public Payment getById(@PathVariable Long paymentId) {
        log.info("Payment get by id : {}", paymentId);
        return paymentService.getPaymentById(paymentId);
    }

    @DeleteMapping("/delete/{paymentId}")
    public void delete(@PathVariable Long paymentId) {
        log.info("Payment delete : {}", paymentId);
        paymentService.deletePayment(paymentId);
    }
}

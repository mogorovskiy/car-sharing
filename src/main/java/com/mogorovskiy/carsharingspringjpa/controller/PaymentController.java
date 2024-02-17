package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.PaymentRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.Payment;
import com.mogorovskiy.carsharingspringjpa.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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

package com.rk.paymentreadapi.controller;

import com.rk.paymentreadapi.model.PaymentTransactions;
import com.rk.paymentreadapi.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/preader")
public class PaymentsReadController {
    @Autowired
    private PaymentsService paymentsService;

    @GetMapping("/payments")
    public ResponseEntity<List<PaymentTransactions>> readPayments(){
        List<PaymentTransactions> paymentTransactions = paymentsService.fetchPaymentTransactions();
        return ResponseEntity.ok().body(paymentTransactions);
    }
}

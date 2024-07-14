package com.rk.paymentreadapi.service;

import com.rk.paymentreadapi.model.PaymentTransactions;

import java.util.List;

public interface PaymentsService {

    List<PaymentTransactions> fetchPaymentTransactions();
}

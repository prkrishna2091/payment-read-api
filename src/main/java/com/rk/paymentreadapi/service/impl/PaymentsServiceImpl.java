package com.rk.paymentreadapi.service.impl;

import com.rk.paymentreadapi.model.PaymentTransactions;
import com.rk.paymentreadapi.repo.PaymentsTransactionsDAO;
import com.rk.paymentreadapi.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    private PaymentsTransactionsDAO paymentsTransactionsDAO;

    @Override
    public List<PaymentTransactions> fetchPaymentTransactions() {
        return paymentsTransactionsDAO.getPaymentsTransactions();
    }
}

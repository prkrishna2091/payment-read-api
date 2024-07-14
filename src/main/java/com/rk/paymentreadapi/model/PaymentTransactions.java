package com.rk.paymentreadapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentTransactions {
    @JsonProperty("transaction_id")
    private Integer transactionId;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("transaction_date")
    private LocalDate transactionDate;
    @JsonProperty("marchant_name")
    private String marchantName;
    @JsonProperty("transaction_type")
    private String transactionType;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("tranasaction_description")
    private String transactionDescription;
    @JsonProperty("transaction_category")
    private String transactionCategory;
    @JsonProperty("transaction_status")
    private String transactionStatus;

}

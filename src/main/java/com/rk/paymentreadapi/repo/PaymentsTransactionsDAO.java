package com.rk.paymentreadapi.repo;

import com.rk.paymentreadapi.model.PaymentTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PaymentsTransactionsDAO {

    private final String PAYMENTS_TRANSACTIONS_TABLE = "payments_transactions";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<PaymentTransactions> getPaymentsTransactions() {

        final String PAYMENTS_TRANSACTIONS_QUERY = "SELECT * FROM " + PAYMENTS_TRANSACTIONS_TABLE;
        return jdbcTemplate.query(PAYMENTS_TRANSACTIONS_QUERY,
                     new RowMapper<PaymentTransactions>() {
                         @Override
                         public PaymentTransactions mapRow(ResultSet rs, int rowNum) throws SQLException {
                               PaymentTransactions paymentTransactions = new PaymentTransactions();
                               paymentTransactions.setTransactionId(rs.getInt("TRANSACTION_ID"));
                               paymentTransactions.setAccountNumber(rs.getString("ACCOUNT_NUMBER"));
                               paymentTransactions.setAmount(rs.getDouble("AMOUNT"));
                               paymentTransactions.setTransactionDate(rs.getDate("TRANSACTION_DATE").toLocalDate());
                               paymentTransactions.setTransactionType(rs.getString("TRANSACTION_TYPE"));
                               paymentTransactions.setTransactionStatus(rs.getString("MERCHANT_NAME"));
                               paymentTransactions.setTransactionType(rs.getString("TRANSACTION_TYPE"));
                               paymentTransactions.setCurrency(rs.getString("CURRENCY"));
                               paymentTransactions.setTransactionDescription(rs.getString("TRANSACTION_DESCRIPTION"));
                               paymentTransactions.setTransactionCategory(rs.getString("TRANSACTION_CATEGORY"));
                               paymentTransactions.setTransactionStatus(rs.getString("TRANSACTION_STATUS"));
                               return paymentTransactions;
                         }
                     });
    }


}

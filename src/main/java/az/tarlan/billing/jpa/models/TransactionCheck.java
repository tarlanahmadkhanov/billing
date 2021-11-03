package az.tarlan.billing.jpa.models;

import az.tarlan.billing.core.models.CheckResponse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "transaction_check")
public class TransactionCheck {

    @Id
    @Column(name = "payment_id")
    private String paymentID;
    private boolean isTransactionAccepted;
    private String accountCurrency;
    private BigDecimal rateEUR;
    private BigDecimal rateUSD;


    public TransactionCheck() {
    }

    public TransactionCheck(CheckResponse checkResponse) {
        this.paymentID = checkResponse.getPaymentID();
        this.isTransactionAccepted = checkResponse.isTransactionAccepted();
        this.accountCurrency = checkResponse.getAccountCurrency();
        this.rateEUR = checkResponse.getRateEUR();
        this.rateUSD = checkResponse.getRateUSD();

    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public boolean isTransactionAccepted() {
        return isTransactionAccepted;
    }

    public void setTransactionAccepted(boolean transactionAccepted) {
        isTransactionAccepted = transactionAccepted;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public BigDecimal getRateEUR() {
        return rateEUR;
    }

    public void setRateEUR(BigDecimal rateEUR) {
        this.rateEUR = rateEUR;
    }

    public BigDecimal getRateUSD() {
        return rateUSD;
    }

    public void setRateUSD(BigDecimal rateUSD) {
        this.rateUSD = rateUSD;
    }
}

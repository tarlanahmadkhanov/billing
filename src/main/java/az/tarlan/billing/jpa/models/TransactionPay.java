package az.tarlan.billing.jpa.models;

import az.tarlan.billing.core.models.PayResponse;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_pay")
public class TransactionPay {
    @Id
    private String paymentID;
    private boolean transactionStatus;

    public TransactionPay() {
    }

    public TransactionPay(PayResponse payResponse) {
        this.paymentID = payResponse.getPaymentID();
        this.transactionStatus = payResponse.isTransactionStatus();
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}

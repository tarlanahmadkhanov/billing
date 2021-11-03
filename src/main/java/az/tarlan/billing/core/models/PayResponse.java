package az.tarlan.billing.core.models;

public class PayResponse {
    private String paymentID;
    private boolean transactionStatus;

    public PayResponse(String paymentID, boolean transactionStatus) {
        this.paymentID = paymentID;
        this.transactionStatus = transactionStatus;
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

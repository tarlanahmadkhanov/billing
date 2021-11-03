package az.tarlan.billing.core.models;

public class PayRequest {
    private String paymentID;

    //TODO

    public PayRequest(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
}

package az.tarlan.billing.core.models;

import java.math.BigDecimal;
import java.util.List;

public class CheckResponse {
    private String paymentID;
    private boolean isTransactionAccepted;
    private String accountCurrency;
    private BigDecimal rateEUR;
    private BigDecimal rateUSD;
    private List<String> availableCurrencies;
    private BigDecimal maxAvailableAmountAZN;
    private BigDecimal maxAvailableAmountUSD;
    private BigDecimal maxAvailableAmountEUR;

    public CheckResponse() {
    }

    public CheckResponse(boolean isTransactionAccepted) {
        this.isTransactionAccepted = isTransactionAccepted;
    }

    public CheckResponse(String paymentID, boolean isTransactionAccepted, String accountCurrency, BigDecimal rateEUR, BigDecimal rateUSD, List<String> availableCurrencies, BigDecimal maxAvailableAmountAZN, BigDecimal maxAvailableAmountUSD, BigDecimal maxAvailableAmountEUR) {
        this.paymentID = paymentID;
        this.isTransactionAccepted = isTransactionAccepted;
        this.accountCurrency = accountCurrency;
        this.rateEUR = rateEUR;
        this.rateUSD = rateUSD;
        this.availableCurrencies = availableCurrencies;
        this.maxAvailableAmountAZN = maxAvailableAmountAZN;
        this.maxAvailableAmountUSD = maxAvailableAmountUSD;
        this.maxAvailableAmountEUR = maxAvailableAmountEUR;
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

    public List<String> getAvailableCurrencies() {
        return availableCurrencies;
    }

    public void setAvailableCurrencies(List<String> availableCurrencies) {
        this.availableCurrencies = availableCurrencies;
    }

    public BigDecimal getMaxAvailableAmountAZN() {
        return maxAvailableAmountAZN;
    }

    public void setMaxAvailableAmountAZN(BigDecimal maxAvailableAmountAZN) {
        this.maxAvailableAmountAZN = maxAvailableAmountAZN;
    }

    public BigDecimal getMaxAvailableAmountUSD() {
        return maxAvailableAmountUSD;
    }

    public void setMaxAvailableAmountUSD(BigDecimal maxAvailableAmountUSD) {
        this.maxAvailableAmountUSD = maxAvailableAmountUSD;
    }

    public BigDecimal getMaxAvailableAmountEUR() {
        return maxAvailableAmountEUR;
    }

    public void setMaxAvailableAmountEUR(BigDecimal maxAvailableAmountEUR) {
        this.maxAvailableAmountEUR = maxAvailableAmountEUR;
    }

}

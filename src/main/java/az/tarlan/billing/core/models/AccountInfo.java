package az.tarlan.billing.core.models;

public class AccountInfo {
    private boolean isAccountExists;
    private String accountCurrency;

    public AccountInfo(boolean isAccountExists, String accountCurrency) {
        this.isAccountExists = isAccountExists;
        this.accountCurrency = accountCurrency;
    }

    public boolean isAccountExists() {
        return isAccountExists;
    }

    public void setAccountExists(boolean accountExists) {
        isAccountExists = accountExists;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }
}

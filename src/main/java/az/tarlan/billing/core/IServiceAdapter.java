package az.tarlan.billing.core;

import az.tarlan.billing.core.models.AccountInfo;

public interface IServiceAdapter {
    AccountInfo getAccountInfo(String accountNumber, String documentNumber);
}

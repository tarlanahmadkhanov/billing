package az.tarlan.billing.core;

import az.tarlan.billing.core.models.AccountInfo;

public class ServiceAdapter implements IServiceAdapter{
    @Override
    public AccountInfo getAccountInfo(String accountNumber, String documentNumber) {
        //TODO
        return new AccountInfo(true, "AZN");
    }
}

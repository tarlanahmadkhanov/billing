package az.tarlan.billing.core;

import az.tarlan.billing.core.models.CheckRequest;
import az.tarlan.billing.core.models.CheckResponse;
import az.tarlan.billing.core.models.PayRequest;
import az.tarlan.billing.core.models.PayResponse;

public interface IBilling {
    CheckResponse check(CheckRequest checkRequest);
    PayResponse pay(PayRequest payRequest);
}

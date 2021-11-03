package az.tarlan.billing.core;

import az.tarlan.billing.core.models.CheckResponse;
import az.tarlan.billing.core.models.PayResponse;

public interface IBillingRepository {
    void saveCheckResult(CheckResponse checkResponse);
    void savePayResult(PayResponse payResponse);
    CheckResponse getCheckResponse(String paymentID);
}

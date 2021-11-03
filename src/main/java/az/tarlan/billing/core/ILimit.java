package az.tarlan.billing.core;

import az.tarlan.billing.core.models.CheckLimitResult;
import az.tarlan.billing.core.models.CheckRequest;

public interface ILimit {
    CheckLimitResult checkLimit(CheckRequest checkRequest);
}

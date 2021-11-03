package az.tarlan.billing.core;

import az.tarlan.billing.core.models.CheckLimitResult;
import az.tarlan.billing.core.models.CheckRequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Limit implements ILimit{
    @Override
    public CheckLimitResult checkLimit(CheckRequest checkRequest) {
        return new CheckLimitResult(true, "AZN", new BigDecimal(1.9803), new BigDecimal(1.7000), Arrays.asList("AZN", "USD", "EUR"), new BigDecimal(1000), new BigDecimal(1000), new BigDecimal(1000));
    }
}

package az.tarlan.billing.core;

import az.tarlan.billing.core.models.*;

import java.util.Random;

public class Billing implements IBilling {

    private IServiceAdapter serviceAdapter;
    private IBillingRepository billingRepository;
    private ILimit limit;

    private Random random;


    public Billing(IServiceAdapter serviceAdapter, IBillingRepository billingRepository, ILimit limit) {
        this.serviceAdapter = serviceAdapter;
        this.billingRepository = billingRepository;
        this.limit = limit;

        random = new Random();
    }

    @Override
    public CheckResponse check(CheckRequest checkRequest) {

        AccountInfo accountInfo = serviceAdapter.getAccountInfo(checkRequest.getAccountNumber(), checkRequest.getDocumentNumber());

        CheckLimitResult checkLimitResult = limit.checkLimit(checkRequest);

        if (accountInfo!=null && accountInfo.isAccountExists() && checkLimitResult!=null && checkLimitResult.isTransactionAccepted()) {

            //TODO
            String paymentID = random.nextInt(1000)+"";

            CheckResponse checkResponse = new CheckResponse(paymentID, true, accountInfo.getAccountCurrency(), checkLimitResult.getRateEUR(), checkLimitResult.getRateUSD(), checkLimitResult.getAvailableCurrencies(), checkLimitResult.getMaxAvailableAmountAZN(), checkLimitResult.getMaxAvailableAmountUSD(), checkLimitResult.getMaxAvailableAmountEUR());


            billingRepository.saveCheckResult(checkResponse);
            return checkResponse;
        } else {
            return new CheckResponse(false);
        }
    }

    @Override
    public PayResponse pay(PayRequest payRequest) {
        //TODO
        PayResponse payResponse = new PayResponse(payRequest.getPaymentID(), false);

        if (checkPaymentParams(payRequest)) {
            payResponse.setTransactionStatus(true);
            billingRepository.savePayResult(payResponse);
        }
        return payResponse;

    }

    //TODO
    private boolean checkPaymentParams(PayRequest payRequest) {
        return true;
    }
}

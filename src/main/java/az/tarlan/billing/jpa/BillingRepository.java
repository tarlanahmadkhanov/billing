package az.tarlan.billing.jpa;

import az.tarlan.billing.core.IBillingRepository;
import az.tarlan.billing.core.models.CheckResponse;
import az.tarlan.billing.core.models.PayResponse;
import az.tarlan.billing.jpa.models.TransactionCheck;
import az.tarlan.billing.jpa.models.TransactionPay;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Arrays;

public class BillingRepository implements IBillingRepository {

    private EntityManagerFactory emf;
    private EntityManager entityManager;

    public BillingRepository() {
        this.emf = Persistence.createEntityManagerFactory("billing_pu");
        this.entityManager = this.emf.createEntityManager();
    }

    public void close() {
        this.entityManager.close();
        this.entityManager.close();
    }

    @Override
    public void saveCheckResult(CheckResponse checkResponse) {
        entityManager.getTransaction().begin();
        entityManager.persist(new TransactionCheck(checkResponse));
        entityManager.getTransaction().commit();
    }

    @Override
    public void savePayResult(PayResponse payResponse) {
        entityManager.getTransaction().begin();
        entityManager.persist(new TransactionPay(payResponse));
        entityManager.getTransaction().commit();
    }

    @Override
    public CheckResponse getCheckResponse(String paymentID) {
        TransactionCheck transactionCheck = entityManager.find(TransactionCheck.class, paymentID);
        CheckResponse checkResponse = new CheckResponse();
        checkResponse.setPaymentID(transactionCheck.getPaymentID());
        checkResponse.setTransactionAccepted(transactionCheck.isTransactionAccepted());
        checkResponse.setAccountCurrency(transactionCheck.getAccountCurrency());
        checkResponse.setRateEUR(transactionCheck.getRateEUR());
        checkResponse.setRateUSD(transactionCheck.getRateUSD());
        //TODO
        checkResponse.setAvailableCurrencies(Arrays.asList("AZN", "USD", "EUR"));
        checkResponse.setMaxAvailableAmountAZN(new BigDecimal(1000));
        checkResponse.setMaxAvailableAmountEUR(new BigDecimal(1000));
        checkResponse.setMaxAvailableAmountEUR(new BigDecimal(1000));
        return checkResponse;
    }
}

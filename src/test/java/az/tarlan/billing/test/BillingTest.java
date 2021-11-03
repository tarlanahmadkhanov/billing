package az.tarlan.billing.test;

import az.tarlan.billing.core.IBilling;
import az.tarlan.billing.core.models.CheckRequest;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class BillingTest {
    ClassPathXmlApplicationContext context;

    public BillingTest() {
        this.context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    }

    @Test
    public void checkResponseIsNotNull() {
        IBilling billing = this.context.getBean("billing", IBilling.class);
        CheckRequest checkRequest = new CheckRequest();
        checkRequest.setAccountNumber("380194400208790003");
        checkRequest.setDocumentNumber("16597561");

        assertNotNull("Service adapter always returns true", billing.check(checkRequest));

    }

    @Test
    public void checkResponseReturnPaymentId() {
        IBilling billing = this.context.getBean("billing", IBilling.class);
        CheckRequest checkRequest = new CheckRequest();
        checkRequest.setAccountNumber("380194400208790003");
        checkRequest.setDocumentNumber("16597561");

        assertNotNull("payment id", billing.check(checkRequest).getPaymentID());
    }


}

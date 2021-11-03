package az.tarlan.billing;

import az.tarlan.billing.core.IBilling;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");

        IBilling billing = context.getBean("billing", IBilling.class);

        context.close();
    }
}

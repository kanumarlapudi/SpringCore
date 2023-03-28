package in.ineuron.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainApp {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		factory.getBean("credit", CreditCardPay.class);
		factory.getBean("Debit", DebitCardPay.class);
		
		PaymentProcess process=factory.getBean("paying", PaymentProcess.class);
		System.out.println("able to get the object");
		process.doPayment(100.0);
	}

}

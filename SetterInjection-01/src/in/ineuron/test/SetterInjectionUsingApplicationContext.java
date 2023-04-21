package in.ineuron.test;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) throws IOException {
		
		System.out.println("******* Application Context Container Starting *******");
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("No of beans is :: " + factory.getBeanDefinitionCount());
		System.out.println("Bean id is  :: " + Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.out.println("****** Application Context Container Started *******");
		
		System.in.read();
		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode value of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);
		String result = wmg.generateBusiness("Harish");
		System.out.println(result + "\n");
		
		WishMessageGenerator wmg1 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode value of wmg is :: " + wmg1.hashCode());
		System.out.println(wmg1);
		String result1 = wmg1.generateBusiness("Dhoni");
		System.out.println(result1 + "\n");
		
		System.out.println();
		
		System.out.println("***** Container is Closing ******");

	}

}

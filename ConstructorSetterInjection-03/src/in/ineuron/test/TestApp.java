package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in\\ineuron\\cfg\\ApplicationContext.xml");
	    System.out.println("Bean Count is :: " + factory.getBeanDefinitionCount());
	    System.out.println("Bean id is :: " + Arrays.toString(factory.getBeanDefinitionNames()));
	    
	    WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
	    System.out.println("\n" + wmg);
	    
	    factory.close();
	}

}

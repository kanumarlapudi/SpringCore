package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.FlipKart;

public class TestAppUsingApplicationContextContainer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in\\\\ineuron\\\\cfg\\\\ApplicationContext.xml");
		System.out.println("*** Container Started ***\n");
        
        System.in.read();
        
        FlipKart flipKart = factory.getBean("fpkt",FlipKart.class);
        System.out.println(flipKart);
        System.out.println();
        String result = flipKart.doShopping(new String[] {"fossil", "tissot"} , new float[] {23456.5f,12345.5f });
        System.out.println(result);
        
        System.out.println("*** Container Stopped ***");
        factory.close();
	}

}

package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.comp.FlipKart;

public class TestApp {

	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("in\\ineuron\\cfg\\ApplicationContext.xml");
        System.out.println("*** Container Started ***");
        
        System.in.read();
        
        FlipKart flipKart = factory.getBean("fpkt",FlipKart.class);
        System.out.println(flipKart);
        System.out.println();
        String result = flipKart.doShopping(new String[] {"fossil", "tissot"} , new float[] {23456.5f,12345.5f });
        System.out.println(result);
        
        System.out.println("*** Container Stopped ***");
	}

}

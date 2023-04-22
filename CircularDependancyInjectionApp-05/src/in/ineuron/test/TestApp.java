package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.A;
import in.ineuron.comp.B;

public class TestApp {

	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in\\ineuron\\cfg\\ApplicationContext.xml");
		System.out.println("*** Container Started ***\n");
		
		System.in.read();
		
		A aObj = factory.getBean("a1", A.class);
		
		B bObj = factory.getBean("b1", B.class);
		
		System.out.println("\n*** Container Stopped ***");
		
	}

}

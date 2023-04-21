package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorInjectionApp {

	public static void main(String[] args) throws IOException {
		
		FileSystemResource resource = new FileSystemResource("D:\\JavaAppsNew\\ConstructorInjection-02\\src\\in\\ineuron\\cfg\\ApplicationContext.xml");

		System.out.println("******* Bean Factory Container Starting *******");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("******* Bean Factory Container Started *******");
		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		
		String result = wmg.generateBusiness("Harish");
		System.out.println(result + "\n");
		
		System.out.println("\n***** Container is Closing ******");

	}

}

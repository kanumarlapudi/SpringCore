package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.Student;

public class TestApp {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("D:\\JavaAppsNew\\ConstructorInjection-04\\src\\in\\ineuron\\cfg\\ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Student std1 = factory.getBean("std1", Student.class);
		System.out.println(std1);
		
		System.out.println();
		
		Student std2 = factory.getBean("std2", Student.class);
		System.out.println(std2);
		
		System.out.println();
		
		Student std3 = factory.getBean("std3", Student.class);
		System.out.println(std3);
		
		System.out.println();
		
		Student std4 = factory.getBean("std4", Student.class);
		System.out.println(std4);
		
        System.out.println();
		
		Student std5 = factory.getBean("std5", Student.class);
		System.out.println(std5);
		
	}

}

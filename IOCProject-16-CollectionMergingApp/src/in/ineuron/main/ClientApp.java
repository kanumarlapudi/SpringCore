package in.ineuron.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggCourse;

public class ClientApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in\\ineuron\\cfg\\applicationContext.xml");
        EnggCourse enggCourse = context.getBean("CS",EnggCourse.class);
        System.out.println(enggCourse);
        ((AbstractApplicationContext) context).close();
	}
}

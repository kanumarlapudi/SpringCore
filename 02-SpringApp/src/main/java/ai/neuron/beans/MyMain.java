package ai.neuron.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CourseSelection select = context.getBean("courseO",CourseSelection.class);
        select.selectCourse();
	}

}

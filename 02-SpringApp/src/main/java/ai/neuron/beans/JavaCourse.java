package ai.neuron.beans;

public class JavaCourse implements ICourses {

	public JavaCourse() {
		System.out.println("Java Course Object has been created by IOC");
	}
	public boolean courseSelection() {
		System.out.println("Java Course is selected");
		return true;

	}

}

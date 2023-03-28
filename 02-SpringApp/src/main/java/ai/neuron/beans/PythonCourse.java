package ai.neuron.beans;

public class PythonCourse implements ICourses {

	public PythonCourse() {
		System.out.println("Python Course Object has been created by IOC");
	}
	
	public boolean courseSelection() {
		System.out.println("Python Course has selected");
		return true;

	}

}

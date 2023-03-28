package ai.neuron.beans;

public class SqlCourse implements ICourses {

	public SqlCourse() {
		System.out.println("SQL Course Object has been created by IOC");
	}
	
	public boolean courseSelection() {
		System.out.println("SQL Course is selected");
		return true;

	}

}

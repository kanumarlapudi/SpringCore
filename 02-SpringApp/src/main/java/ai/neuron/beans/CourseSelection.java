package ai.neuron.beans;

public class CourseSelection {

	private ICourses course;
	
	public void setCourse(ICourses course) {
		this.course = course;
	}
	
	public void selectCourse() {
		boolean status = course.courseSelection();
		if(status) {
			System.out.println("course selected successfully");
		}
		else {
			System.out.println("Failed to select");
		}
	}
}

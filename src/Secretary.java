
public class Secretary extends Staff {

	
	//constructor
	public Secretary(String identificationNumber,String taskInformation,int workingHours) {
		super( identificationNumber, taskInformation, workingHours);
	}
	//functions
	public void assignmentLecturer(Courses course,Lecturers lecturer) {
		course.setLecturer(lecturer);
		}
	
}

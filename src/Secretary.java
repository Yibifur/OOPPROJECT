
public class Secretary extends Staff {

	//variables
	private int hourPayment;
	//constructor
	public Secretary(String name,String surName,String identificationNumber,String taskInformation,int workingHours,int hourPayment) {
		super( name,surName,identificationNumber, taskInformation, workingHours);
		this.hourPayment=hourPayment;
	}
	//functions
	public void assignmentLecturer(Courses course,Lecturers lecturer) {
		course.setLecturer(lecturer);
		}
	//functions
	public void showWorkingHours() {
		System.out.println("working hours of Cleaning member that is"+super.getName()+" "+super.getSurName()+": "+super.getWorkingHours());
	}
	public void showIdentificationNumber() {
		System.out.println("Identification Number of Cleaning member that is"+super.getName()+" "+super.getSurName()+": "+super.getIdentificationNumber());
	}
	public void dailySalary() {
		int dailySalary=hourPayment*super.getWorkingHours();
		System.out.println("Daily salary of Cleaning member that is"+super.getName()+" "+super.getSurName()+": "+dailySalary);
	}
}

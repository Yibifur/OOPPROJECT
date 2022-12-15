
public class Lecturers  {
	//variables
private String number;
private String  name;
private String surName;
private final int maxCourses=10;
private int courseCount=0;
Courses[] courses =new Courses[maxCourses];
//constructor
public Lecturers(String number,String name,String surName) {
	this.number=number;
	this.name=name;
	this.surName=surName;
}
//getter setters
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number=number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public void setSurName(String surName) {
	this.surName=surName;
}
public String  getSurName() {
	return surName;
}
//methods
public void addCourse(Courses course) {
	if(courseCount==10) {
		System.out.println("This lecturer Access to max course number.");
		}
	courses[courseCount]=course;
	courseCount++;
	}
	public void addGrades(int midTerm,int finalTerm,Students student) {
		if()) {
			
		}
		else if()){
			
		}
	}


}

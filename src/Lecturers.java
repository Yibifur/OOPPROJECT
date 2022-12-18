
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
	public void addGradesUnderGraduate(int courseCode,int midTerm,int finalTerm,Students student) {
		
		
		for(int i=0;i<student.getUnderGraduateCourses().length;i++) {
			if(courseCode==student.getUnderGraduateCourses()[i].getCourseCode()) {
				student.getUnderGraduateCourses()[i].setMidTerm(midTerm);
				student.getUnderGraduateCourses()[i].setFinalExam(finalTerm);
			}
			
		}
		
	}
	public void addGradesGraduate(int courseCode,int midTerm,int finalTerm,Graduate student) {
		for(int i=0;i<student.getGraduateCourses().length;i++) {
			if(courseCode==student.getGraduateCourses()[i].getCourseCode()) {
				student.getGraduateCourses()[i].setMidTerm(midTerm);
				student.getGraduateCourses()[i].setFinalExam(finalTerm);
			}
			}
	}
	public boolean checkCertificate(Students student) {
	  if(student.getUnderGraduateCourses().length>=40&&student.calculateGPA()>=2.0) {
		  return true;
	  }
	  return false;
	}
	public boolean checkCertificate(Master master) {
		  if(master.getGraduateCourses().length>=7&&master.calculateGPA()>=2.5) {
			  return true;
		  }
		  return false;
		}
	public boolean checkCertificate(Doctoral doctoral) {
		  if(doctoral.getGraduateCourses().length>=8&&doctoral.calculateGPA()>=3.0) {
			  return true;
		  }
		  return false;
		}
	

}

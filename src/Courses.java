
public class Courses {
	public enum TypeOfCourse{
		GRADUATE,
		UNDERGRADUATE
		
	}
	
	
	//variables
	public TypeOfCourse type;
	private String courseName;
	private int courseCode;
	private String courselocation;
	private int courseCredit;
	private Lecturers lecturer;
	private int midTerm;
	private int finalExam;
	private Students[] courseStudents;
	private int studentCount=0;
	
	
	
	//constructor
public Courses(String courseName,int courseCode, String courselocation,int courseCredit, Lecturers lecturer,int midTerm,int finalExam,TypeOfCourse type) {
super();
 this.courseCode=courseCode;
 this.courseCredit=courseCredit;
 this.courselocation=courselocation;
 this.lecturer=lecturer;
 this.midTerm=midTerm;
 this.finalExam=finalExam;
this.type=type;
}	
public Courses() {
	
}
//getter setter

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseCode() {
	return courseCode;
}

public void setCourseCode(int courseCode) {
	this.courseCode = courseCode;
}

public String getCourselocation() {
	return courselocation;
}

public void setCourselocation(String courselocation) {
	this.courselocation = courselocation;
}

public int getCourseCredit() {
	return courseCredit;
}

public void setCourseCredit(int courseCredit) {
	this.courseCredit = courseCredit;
}

public Lecturers getLecturer() {
	return lecturer;
}

public void setLecturer(Lecturers lecturer) {
	this.lecturer = lecturer;
}
public void setCourseStudents(Students[] courseStudents) {
	this.courseStudents=courseStudents;
}
public Students[] getCourseStudents() {
	return courseStudents;
}

//methods
public void lecturerInfo() {
	System.out.println("öğretmenin adı: "+lecturer.getName());
	System.out.println("öğretmenin soyadı: "+lecturer.getSurName());
	System.out.println("öğretmenin numarası: "+lecturer.getNumber());
}
public void studentIdInformation() {
	for(int i=0;i<courseStudents.length;i++) {
		System.out.println((i+1)+". öğrencinin adı: "+courseStudents[i].getName());
		System.out.println((i+1)+".öğrencinin  soyadı: "+courseStudents[i].getSurName());
		System.out.println((i+1)+".öğrencinin numarası: "+courseStudents[i].getId());
		System.out.println((i+1)+".öğrencinin numarası: "+courseStudents[i].getYear());
	}
}
public void addStudentToCourse(Students student) {
	courseStudents[studentCount]=student;
	studentCount++;
}

}

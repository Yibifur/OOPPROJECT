//github denemesi

public class Students {
	public enum TypeOfCourse2{
		GRADUATE,
		UNDERGRADUATE
		
	}
//variables
	private int id;
	private String name;
	private String surName;
	private int year;
	private Courses[] underGraduateCourses;
	private Courses[] graduateCourses;
	private int underGraduateCourseCount=0;
	private int GraduateCourseCount=0;
	private int graduateStudentCount=0;
	private int underGraduateStudentCount=0;
	
	//constructor
	public Students(int id,String name, String surName, int year) {
		super();
		this.id=id;
		this.name = name;
		this.surName = surName;
		this.year = year;
		
		
	}
	public Students() {
		
	}
//getter 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public int getYear() {
		return year;
	}
	public Courses[] getUnderGraduateCourses() {
		return underGraduateCourses;
	}
	public Courses[] getGraduateCourses() {
		return graduateCourses;
	}
	public int getGraduateCourseCount() {
		return GraduateCourseCount;
	}
	//methods
	public void addCourseToStudent(Courses course) {
	TypeOfCourse2 type1=TypeOfCourse2.GRADUATE;
	TypeOfCourse2 type2=TypeOfCourse2.UNDERGRADUATE;
		if(type1.equals(course.type)) {
			graduateCourses[GraduateCourseCount]=course;
			course.getCourseStudents()[graduateStudentCount]=Students.this;
			GraduateCourseCount++;
			graduateStudentCount++;
		}
		else if(type2.equals(course.type)){
			underGraduateCourses[underGraduateCourseCount]=course;
			course.getCourseStudents()[underGraduateStudentCount]=Students.this;
			underGraduateCourseCount++;
			underGraduateStudentCount++;
		}
		
		
	}
	
	
	
	public void checkCourse() {
		
			if(underGraduateCourseCount==0) {
			System.out.println("bu öğrenciye ders ataması yapılmamıştır.");
		}
		else {
			System.out.println(getId()+" numaralı"+getName()+ " "+getSurName()+" adlı  öğrenciye "+underGraduateCourseCount+" tane dersin ataması yapılmıştır.");
			
		}
		
		
	}
	
}

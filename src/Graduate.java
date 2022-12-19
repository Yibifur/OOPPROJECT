

public abstract class Graduate extends Students{
//variables
	
	
	private Courses[] graduateCourses;
	private int GraduateCourseCount=0;
	private int graduateStudentCount=0;
	//constructor
	public Graduate(int id,String name, String surName, int year) {
		super(id,name,surName,year);
	
	}
	public Graduate(){
		super();
	}
	//getter 
	
	
	public Courses[] getGraduateCourses() {
		return graduateCourses;
	}
	
	public int getGraduateCourseCount() {
		return GraduateCourseCount;
	}
	
	public int getGraduateStudentCount() {
		return graduateStudentCount;
	}
	
	public void checkCourse() {
		
			if(this.GraduateCourseCount==0) {
			System.out.println("bu öğrenciye ders ataması yapılmamıştır.");
		}
		else {
			System.out.println(getId()+" numaralı"+getName()+ " "+getSurName()+" adlı  öğrenciye "+this.GraduateCourseCount+" tane dersin ataması yapılmıştır.");
		}
		
		
	}
	public void addCourseToStudent(Courses course) {
		TypeOfCourse2 type=TypeOfCourse2.GRADUATE;
		
		 if(type.equals(course.type)){
			graduateCourses[GraduateCourseCount]=course;
			course.getCourseStudents()[graduateStudentCount]=Graduate.this;
			GraduateCourseCount++;
			graduateStudentCount++;
		}
	}
}

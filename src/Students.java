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
	private int underGraduateCourseCount=0;
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
	
	public int getUnderGraduateStudentCount() {
		return underGraduateStudentCount;
	}
	
	//methods
	public void addCourseToStudent(Courses course) {
	
	TypeOfCourse2 type=TypeOfCourse2.UNDERGRADUATE;
		
		 if(type.equals(course.type)){
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
	public double calculateGPA( ) {
		double[] averageGrades=new double[this.getUnderGraduateCourses().length];
		double total=0.0;
		for(int i=0;i<this.getUnderGraduateCourses().length;i++) {
			averageGrades[i]=(double)((this.getUnderGraduateCourses()[i].getMidTerm()*4/10+this.getUnderGraduateCourses()[i].getFinalExam()*6/10)/25);
		}
		for(int j=0;j<averageGrades.length;j++) {
			total=total+averageGrades[j];
		}
		total=total/averageGrades.length;
		return total;
	}
	}
	
	
	

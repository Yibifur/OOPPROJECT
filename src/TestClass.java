

public class TestClass {
	
	
	public static void main(String[] args) {
		Lecturers ceng203Lecturer=new Lecturers("1","Uraz ","Yavanoğlu");
		
		Students student1=new Students(2,"Egehan","Furkan",2020);
		Students student2=new Students(3,"Osman","Çoban",2020);
		Students student3=new Students(1,"Yiğit Birkan","Furkan",2020);
		Students student4=new Students(2,"Egehan","Furkan",2020);
		Courses ceng203 =new Courses("ceng203",203,"418",5,ceng203Lecturer,60,80,Courses.TypeOfCourse.GRADUATE);
	ceng203.addStudentToCourse(student1);
	ceng203.addStudentToCourse(student2);
	ceng203.addStudentToCourse(student3);
	ceng203.addStudentToCourse(student4);
	
	
	ceng203.studentIdInformation();
	
	
}

		
	

}

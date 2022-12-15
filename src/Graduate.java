
public class Graduate extends Students{
//variables
	
	private String degree;
	//constructor
	public Graduate(int id,String name, String surName, int year,String degree) {
		super(id,name,surName,year);
		this.degree=degree;
	}
	public Graduate(){
		super();
	}
	//getter setter
	public String getDegree() {
		return degree;
	}
	
	public void checkCourse() {
		
			if(this.getGraduateCourseCount()==0) {
			System.out.println("bu öğrenciye ders ataması yapılmamıştır.");
		}
		else {
			System.out.println(getId()+" numaralı"+getName()+ " "+getSurName()+" adlı  öğrenciye "+this.getGraduateCourseCount()+" tane dersin ataması yapılmıştır.");
		}
		
		
	}
}


public class Technical extends Staff{
	//variables
	private int hourPayment;
	//constructor
		public Technical(String name,String surName,String identificationNumber,String taskInformation,int workingHours,int hourPayment) {
			super(name,surName,identificationNumber, taskInformation, workingHours);
			this.hourPayment=hourPayment;
		}
		//getter setter
		public int getHourPayment() {
			return hourPayment;
		}
		public void setHourPayment(int hourPayment) {
			this.hourPayment = hourPayment;
		}
		//functions
		public void showWorkingHours() {
			System.out.println("working hours of Technical member that is"+super.getName()+" "+super.getSurName()+": "+super.getWorkingHours());
		}
		public void showIdentificationNumber() {
			System.out.println("Identification Number of Technical member that is"+super.getName()+" "+super.getSurName()+": "+super.getIdentificationNumber());
		}
		public void dailySalary() {
			int dailySalary=hourPayment*super.getWorkingHours();
			System.out.println("Daily salary of Technical member that is"+super.getName()+" "+super.getSurName()+": "+dailySalary);
		}
}

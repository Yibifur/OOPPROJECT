
public abstract class Staff {
//variables
	
	private String name;
	private String surName;
	private String identificationNumber;
	private String taskInformation;
	private int workingHours;
	//constructor
	public Staff(String name,String surName,String identificationNumber,String taskInformation,int workingHours) {
		//this.hourPayment=hourPayment;
		this.name=name;
		this.surName=surName;
		this.identificationNumber=identificationNumber;
		this.taskInformation=taskInformation;
		this.workingHours=workingHours;
	}
	//getter setters
	
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTaskInformation() {
		return taskInformation;
	}
	public void setTaskInformation(String taskInformation) {
		this.taskInformation = taskInformation;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	public abstract void showWorkingHours();
	public abstract void showIdentificationNumber();
	public abstract void dailySalary() ;
		
	
	
	
}

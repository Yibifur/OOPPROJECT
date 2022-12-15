
public class Areas {
//variables
	private String lecturesRoom;
	private String  auxiliaryStaffRoom;
	private String canteen;
	private String garden;
	//constructor
	public Areas(String lecturesRoom,String auxiliaryStaffRoom,String canteen,String garden) {
		this.auxiliaryStaffRoom=auxiliaryStaffRoom;
		this.lecturesRoom=lecturesRoom;
		this.canteen=canteen;
		this.garden=garden;
		
	}
	//getter setter
	public String getLecturesRoom() {
		return lecturesRoom;
	}
	public void setLecturesRoom(String lecturesRoom) {
		this.lecturesRoom = lecturesRoom;
	}
	public String getAuxiliaryStaffRoom() {
		return auxiliaryStaffRoom;
	}
	public void setAuxiliaryStaffRoom(String auxiliaryStaffRoom) {
		this.auxiliaryStaffRoom = auxiliaryStaffRoom;
	}
	public String getCanteen() {
		return canteen;
	}
	public void setCanteen(String canteen) {
		this.canteen = canteen;
	}
	public String getGarden() {
		return garden;
	}
	public void setGarden(String garden) {
		this.garden = garden;
	}
	
}

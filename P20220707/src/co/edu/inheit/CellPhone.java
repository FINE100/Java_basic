package co.edu.inheit;
/*
 * 상속 (부모 <- 자식) 
 * 부모가 가진 성질을 자식이 상속 받음
 * Cell phone <- DmbPhone
 */

public class CellPhone /*extends Object*/ { // 표기하지 않아도 부모는 objcet에서 상속 받음 
	// field.
	private String model;
	private String color;
	

	// constructor. (생성자, 자식이 부모생성자 호출 가능)
	public CellPhone() {} //default constructor
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void bell() {
		System.out.println("bell");
	}
	public void sendVoice() {
		System.out.println("메세지 전송");
	}
	public void receiveVoice() {
		System.out.println("메세지 수신");
	}
	
	//get, set
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//재정의
	
	@Override
	public String toString() {
		return "model명은 " + model + ", 색상은 "+ color +"입니다.";
	}
	
	
	
	
	
}

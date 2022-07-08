package co.edu.inheit;
/*
 * 상속 : 자식이 부모를 선택(extends)
 */
public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone() {
		super();
	}
	public DmbCellPhone(String model, String color,int channel) {
		super(model, color);
		this.channel = channel;
	}
	public void turnOn() {
		System.out.println("dmb 화면 on");
	}
	
	public void turnOff() {
		System.out.println("dmb 화면 off");
	}
	
	@Override
	public void bell() {		
		System.out.println("벨이 울립니다.");	
		
	}
	
	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 "+ getColor() +", 채널은 "+ channel + "입니다.";
	}
	
	//overriding : 재정의. 오른쪽 마우스 source - override 클릭
	

}

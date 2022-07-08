package co.edu.inheit;

public class MainExample {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("Anycall");
		phone.setColor("white");
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		
		phone.turnOn();
		phone.turnOff(); //자식 클래스 DmbCellphone에서 만든 메소드
		
		phone.powerOff();
		
		//SmartPhone 기능
		
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		System.out.println("자동형변환 >>>>>>>>>");
		
		//  부모 > 자식. (부모는 자식보다 크다, 형변환) int : 자동형변환, long <- int, 강제형변환 int <- long  
		CellPhone dphone = new DmbCellPhone("i-phone", "Red", 100);
		System.out.println(dphone.toString());
				
		
		CellPhone cphone = new CellPhone(); // 부모 클래스로 자식 클래스 새로 호출 가능 
		cphone.setModel("LG Phone");
		cphone.setColor("Gray");
		System.out.println(cphone.toString());
		
		
		if(cphone instanceof DmbCellPhone) {
		DmbCellPhone dcp = (DmbCellPhone) cphone; // 컴파일 오류(x) 실행시 오류(o)
		dcp.powerOn();
//      dcp.turnOn();						//부모 클래스로 호출시, 자식의 기능은 사용 불가 (부모가 선언한 기능만 사용 가능)
		dcp.powerOff();
		 
	}

}
}
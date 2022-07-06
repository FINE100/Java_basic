package co.edu.compound;

/*
 * 자동차(object) -> 자바 세계로 옮겨오면 class가 됨
 */
public class Car {	//설계도
	// 속성(model,price...) : 필드
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight; 
	double width;						// 필요한 정보를 추상화라고 함
	
	
	//생성자 : 필드의 초기값을 지정.
	public Car() {
		System.out.println("생성자 호출되었습니다.");
		maxSpeed = 200;
	}
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	


	// 동작 : 메소드.
	public void setSpeed(int speed) {
		this.speed = speed;				// 필드와 변수 이름이 동일할 경우, 변수가 우선순위. this를 붙여야 인스턴스로 인식하고 매개값(int speed) 할당
	}
	public void showSpeed() {
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
	}
	public void run() {
		System.out.println(model +"가 달립니다.");
	}
	public void start() {
		System.out.println(model +"가 출발합니다.");
}
	public void stop() {
		System.out.println(model +"가 멈춥니다.");
}
	}
package co.edu;
/*
 * static 정적 메소드, 정적필드 사용.
 */

public class staticMain {
	public static void main(String[] args) {
		//정적(static)
		Calculator cal = new Calculator();
		System.out.println(cal.pi);
		
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10, 20);
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);  // 스택에 담긴 주소값이 동일한지 묻는 것 = 동일한 인스턴스이다 
		
	
}
}

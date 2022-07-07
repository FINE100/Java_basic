package co.edu;

/*
 * 인스턴스 여러개 생성 하지 않고 하나만 존재
 */


public class Singleton {
	
	private static  Singleton instance = new Singleton();   // static 메소드 안에 존재하게 해줌
											// 클래스 자체를 타입으로 사용할 수 있다. (Singleton >> 여기에서 클래스이면서 타입으로 쓰임)
								
	private Singleton( ) {}
	
	public static Singleton getInstance() {
		return instance;
	}

}

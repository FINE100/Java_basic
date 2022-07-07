package co.edu;

/*
 * 상수 vs 변수
 * 변수에 final 붙으면 상수.
 * 메소드에 final이 붙으면 재정의(overriding) 불가
 * 클래스에 final이 붙으면 상속이 불가.
 */
/*
 * 클래스 선언은 파일 하나(ex.FinalExample)에 하나 작성이 원칙.
 * (여러개 쓸수는 있으나 불편)
 */
class Person {
	final String ssn; // 주민번호
	String name;
	

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class FinalExample {
	public static void main(String[] args) {

		// 변수
		String name = "홍길동";
		name = "김민수";

		// 상수.
		final int num = 10;
//		num = 20; //
		
		Person person = new Person("970802-123456", "홍길동"); //인스턴스 생성 통해서 필드 사용 가능하게 하는 작업
		person.name = "홍민수";
//		person.ssn = "970504-123456"; // final로 선언해서 변경 불가

	}

}

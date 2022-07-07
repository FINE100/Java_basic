package co.edu;
/*
 * 클래스 연습 >> StudentMain에서 사용
 */

public class Student {
	// 필드.
	private String sno;
	private String name;
	private int score;

	// 생성자 : 기본생성자.
	public Student() {
		
	}
	
	// 생성자 오버로딩. => 오버로딩을 쓰면 코드가 훨씬 간결해짐
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	// getter, setter
	public void setSno(String sno) { // 학번에 값 대입
		this.sno = sno; // this. => 매개값으로 들어온 값을 필드에다가 담겠다
	}

	 void setName(String name) { //default 접근자 (접근자 없을 때), 다른 클래스에서 조회 안됨
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public String getSno() { // 학번 반환
		return this.sno;
}
	public int getscore() {
		return this.score;
	}
	public String getName() {
		return this.name;
	}

	// 전체 정보를 보여주는 showInfo()
	
	public void showInfo() {
		System.out.printf("학번 : %s, 이름 : %s, 점수 : %d\n", sno, name, score); //필드 정보 대입하여 보여줌
	}
	
}

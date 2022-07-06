package co.edu.compound;

/*
 * 친구 정보 : 이름, 연락처, email, 생일, 키, 몸무게 
 */
public class Friend {

	// 필드. 명명규칙 (소문자 시작, 두단어 조합시 두번째 단어 첫글자 대문자(camelCase), 영문이 제일 먼저)

	private String name; // 외부에서는 볼 수 없게끔 막음 = private
	private String tel;
	private String email;
	private String birth;
	private double height;
	private double weight;

	// 생성자 : 기본생성자를 생성

	public Friend() {

	}

	// 메소드 : 이름, 연락처를 보여주는 showInfo ()

	public void showInfo() {
		System.out.printf("이름은 %s이고, 전화번호는 %s입니다", name, tel);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setHight(double height) {
		if (height < 0) {
			System.out.println("잘못된 값을 입력하였습니다.");
			this.height = 165.0;
		} else {
			this.height = height;
		}

	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setEmail(String email) {
		this.email = birth;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("잘못된 값을 입력하였습니다.");
			this.weight = 50.5;
		} else {
			this.weight = weight;
		}
	}
	//get메소드 오른쪽 마우스 클릭 - [source] - [General Getter and Setter] 이용해서 자동으로 만들 수 있음
	
	public double getWeight() {
		return weight;

	}

	public double getHeight() {
		return height;

	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getBirth() {
		return birth;
	}
	
}
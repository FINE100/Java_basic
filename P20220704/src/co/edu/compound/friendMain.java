package co.edu.compound;

public class friendMain {
	public static void main(String[] args) {
	
		// 원래 메소드로 데이터 입력하여 수정할 수 있어야함! 필드는 private화
		//f1 
		
		Friend f1 = new Friend();
//		f1.name = "이소정";
		f1.setName("이소정");
		
		
//		f1.tel = "010-4727-9945";
		f1.setTel("010-4727-9945");
		
		
//		f1.email = "cresent@gmail.com";
		f1.setEmail("cresent@gmail.com");

		//f1.birth = "9월 27일";
		f1.setBirth("9월 27일");
		
//		f1.height = 157.5;
		f1.setHight(-157.5);
		System.out.println("키정보 : " + f1.getHeight());
		
//		f1.weight = 53.2;
		f1.setWeight(53.5);
		System.out.println("몸무게 정보 : "+f1.getWeight());
		

		f1.showInfo();
		
  }
}

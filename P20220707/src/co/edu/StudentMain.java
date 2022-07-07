package co.edu;

public class StudentMain {
	
	//필드
	
	//메소드
	public static void main(String[] args) {
		System.out.println(args[0]); //run configurations에서 argument 설정 후 어떻게 출력하는지 보기 위해서 씀
		System.out.println(args[1]); // 콘솔 창에서 입력한 메모 확인 가능
		
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setScore(80);
		kim.setName("김민수");
		
		System.out.println("이름 : "+kim.getName());
		kim.showInfo();
		
		Student park = new Student("22-002","박희수",85);
		park.showInfo();
		
		
		//학생추가
		Student noh = new Student("22-003","노은경",100);
	    noh.showInfo();
		
		
		Course course = new Course("김철수","1-3", 25);
		System.out.println("선생님 : " + course.getTname());
		System.out.println("반정보 : " + course.getBname());
		
	
		
		//학생등록
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(noh);
		
		//학생리스트
		
		course.getStudents();
		
		//최고점 학생정보보기
		System.out.println("최고 점수 학생: ");
		Student maxStudent = course.getMaxStudent(); 
	    maxStudent.showInfo(); //두 구문 합쳐서 course.getMaxStudent().showInfo() 한줄로 적어도 됨
	    
	    //반 평균
	    System.out.println("반 평균 : " +course.getAvgScore());

		
		
	}

}

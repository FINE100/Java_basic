package co.edu;

public class HelloWorld {

	public static void main(String[] args) {
		// 변수의 종류 : int(정수), double(실수), boolean(논리_참,거짓), String(문자열)
		// int(4byte) < double(8byte) 
		// 정수 : byte(1byte) < short(2byte) < int(4byte) < long(8byte)
		
		
		
		
		String name = "노은경"; 	//String : 문자열, name : (문자타입) 변수
		name = "10"; 
		// 두 단어의 조합 변수 선언시, 두번째 단어의 첫번째 글자는 대문자로 작성 ex. myName
		
		
				
		int myAge = 20;  		//int 정수 타입, myAge 변수 = 29 (타입과 변수값 일치하게 선언) 
								// 선언하면서 값을 할당 => 초기화 
		int yourAge;   			// 선언만 하는 것은 초기화 X
		yourAge = 22;
		
		
		
		double height = 162.4;
		boolean isMarried = true; 		// true or false 가능
		String myAddress = "대구시";
		
		
		myAge = 30; 					//이미 선언했으므로 변수만 입력하면 됨
		height = 165.2;
		
		int result = myAge + yourAge; 			   // 변수는 사용을 위해서 값이 할당되어 있어야함
		double result1 = (double) myAge + height; // 더 큰 값으로 형변환 필요
		
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println("안녕하세요 " + name + " 입니다!!");

	}

}

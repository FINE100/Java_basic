package co.edu;

import java.util.Scanner; //scanner 쓸 때 필수 입력

public class Example05 {
	public static void main(String[] args) {
		
		System.out.println("값을 입력.");
		Scanner sn = new Scanner(System.in); 
		//원래 변수 입력할 때 String name = new String("홍길동") 이런식으로 선언해줘야함.
		
//		String input = sn.nextLine(); // 문자열로 읽을 때
//		System.out.printf("입력값은 %S",input);
					
//		int input = sn.nextInt(); // 정수로 읽을 때
//		System.out.printf("입력값은 %d",input);
	
	
		System.out.println("첫번째 값을 입력");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력");
		int num2 = sn.nextInt();
		

		int result = 0;
		
		if(num1>num2) {
			result = num1-num2;
			System.out.printf("입력값 %d와 %d의 차이은 %d입니다.",num1,num2,result);
		}else{
			result = num2-num1;
			System.out.printf("입력값 %d와 %d의 차이은 %d입니다.",num2,num1,result);
			
			}
		
		
		//int result = num1 + num2; // 입력한 2개 수의 합
		
	    //System.out.printf("입력값 %d와 %d의 합은 %d입니다.",num1,num2,result); //입력값 a와 b의 합은 c입니다.
		
		//System.out.printf("입력값 %d와 %d의 차이은 %d입니다.",num1,num2,result); //입력값 a와 b의 합은 c입니다.
	}

}

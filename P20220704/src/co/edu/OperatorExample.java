package co.edu;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;
		result = num1 % num2;  // 나머지 연산자.
		
		result = num1 % 2; // 홀수, 짝수
		
		System.out.println("임의의 값을 입력하세요 : ");
		num1 = scn.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	
		result = 20 + (2 * 3) ;
		System.out.println(result);
		
		num1++; // num1 = num1 + 1;
		System.out.println(num1); // 입력값 10일때, 11
		
		num1--; // num1 = num1 - 1;
		System.out.println(num1); // 10
		
		// System.out.println(num1++);//10, 현재값10 num1을 출력하고 나중에 더해줌
		System.out.println(++num1);//11, num1에 1을 먼저 더해준 후에 출력
		
		result = ++ num1 + ++num2; //num1 : 11, num2 : 20 
		System.out.println(result); // result : 31  num1 : 12, num2: 21
		
		result = num1 + num2; 
		System.out.println(result);
		
		// 논리부정연산자 : !  (NOT)
		boolean isEven = result % 2 == 0;
		if(!isEven) {
			System.out.println("결과값이 홀수입니다.");
			
		}
	}

}

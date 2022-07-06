package co.edu.loop;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		int sum = 0;
		//sum의 누적값이 100을 초과할 때 반복문을 종료함
		
		do {
			System.out.println("임의의 값을 입력>>>");
	     	int num = scn.nextInt();
			sum += num;
						
			if(sum>100) {
				sum -= num; //누적값 100 넘기 직전 값 구하기
				System.out.println("반복문을 종료합니다.");
				break; // 또는 isTrue = false;								
			}			
			
		} while (isTrue);
		//누적값이 100을 초과하기 전의 값을 출력
		System.out.println("sum의 누적값:" + sum); 
		
		System.out.println("end of prog.");

	}

}

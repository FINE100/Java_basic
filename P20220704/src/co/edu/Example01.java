package co.edu;

import java.util.Scanner;  //ctrl + shift + O : import 삽입

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("임의의 숫자 입력 >>");
		int num1 = scn.nextInt();
		
		//3의 배수 => 입력 n은 3의 배수입니다. 입력 n은 3의 배수가 아닙니다다.
		
		int result = num1%3 ;
		
		if(result == 0) {
			System.out.println("입력한 " +num1 + "은 3의 배수입니다.");
		} else {
			System.out.println("입력한 " + num1 + "은 3의 배수가 아닙니다.");
		}
		
	}

}

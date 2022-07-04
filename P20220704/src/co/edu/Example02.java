package co.edu;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100 ~ 90 : A, ~ 80 : B, ~70 : C, 그외 : D
		// 출력값 : 점수 78은 C 등급입니다.

		Scanner scn = new Scanner(System.in);
		System.out.println("성적 입력해주세요");
		int score = scn.nextInt();
		String grade = "";

		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("점수 " + score + "는 " + grade + " 등급입니다!");
		
		// 위의 문제를 삼항자 연산자로 표현하기
		
		grade = (score>=90)? "A" :(((score>=80)?"B":(score>=70)?"C":"D"));
		
		System.out.println("점수 " + score + "는 " + grade + " 등급입니다!");
	}
}


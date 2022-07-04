package co.edu;

import java.util.Scanner;

public class Example_proex {

	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100 ~ 90 : A, ~ 80 : B, ~70 : C, 그외 : D
		// 출력값 : 점수 78은 C 등급입니다.
		// ctrl + shitf + f = 들여쓰기 정렬
		

		Scanner scn = new Scanner(System.in);
		System.out.println("성적 입력해주세요");
		int score = scn.nextInt();
		String grade = "";

		if (score >= 90 && score <= 100) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		System.out.println("점수 " + score + "는 " + grade + " 등급입니다!");
	}
}
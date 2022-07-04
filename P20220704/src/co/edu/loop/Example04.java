package co.edu.loop;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1 ~ 100 임의의 수 생성.
		Scanner scn = new Scanner(System.in);

		int temp = ((int) Math.random() * 100) + 1;

		while (true) {
			System.out.println("임의의 값을 입력해보세요!");
			int inputVal = scn.nextInt();

			if (inputVal == temp) {
				System.out.println("맞췄습니다~~^^");
				break;

			} else if (inputVal > temp) {
				System.out.println("입력값이 임의의 값보다 큽니다.");
				
			} else if (inputVal < temp) {
				System.out.println("입력값이 임의의 값보다 작습니다.");
				

			}

		}

		System.out.println("end of prog.");

	}

}

package co.edu.reference;

import java.util.Scanner;

public class MoringEx {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생 수
		int[] scores = null; // 참조변수 초기화
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("\n 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("선택 >>");

			int selectNo = Integer.parseInt(scn.nextLine());

			// 배열을 지정하지 않고 다른 메뉴를 선택하면 메세지 보여주기
			if (scores == null) {
				if (!(selectNo == 1 || selectNo == 5)) {
					System.out.println("학생 수를 먼저 지정하세요");
					continue;
				}
			}

			if (selectNo == 1) {
				System.out.print("학생수 입력 >>");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > " + scores[i] + "\n");

				}

			} else if (selectNo == 4) {
				System.out.print("분석 >>\n"); // 합계, 평균, 최댓값, 최솟값
				int max = scores[0];
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max > scores[i]) { // 배열의 첫번째 숫자거나 max보다 더 큰 경우
						max = scores[i];
					}
					sum += scores[i];
					avg = (double) sum / scores.length;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("전체 합계 : " + sum);
				System.out.println("전체 평균 : " + avg);

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료.");
	}

}

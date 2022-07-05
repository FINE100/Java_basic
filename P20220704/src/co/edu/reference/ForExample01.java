package co.edu.reference;

import java.util.Arrays;

public class ForExample01 {

	public static void main(String[] args) {

		// 배열
		int[] tempAry = new int[5];

		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);
		}
		// 제일 큰 값을 max에 담기
		Arrays.sort(tempAry); // 오름차순 Arrays.sort
		for (int num : tempAry) {
			System.out.println(num); // 향상된 for문
		}
		int max = 0;

		for (int i = 0; i < tempAry.length; i++) {
			if (tempAry[i] > max) {
				max = tempAry[i];
			}
		}
		System.out.println("제일 큰값 : " + max);

	}

}

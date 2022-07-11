package co.yedam;

import java.util.Arrays;
import java.util.Scanner;

public class reExm03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=1; i<=T; i++) {
			int[] arr = new int[3];
			int sum = 0;
			double avg;
			for(int j=0; j<arr.length; j++) {
				arr[j] = scan.nextInt(); 
			}
			Arrays.sort(arr);	// 배열 정렬
			
			for(int j=1; j<arr.length-1; j++) {
				sum += arr[j];	// 배열 합(가장 큰 수, 가장 작은 수 제외)
			}
			avg = (double)sum / 8;		// 총 합의 평균
			System.out.println("#" + i + " " + Math.round(avg));	// 소수점 첫번째 자리에서 반올림
			
		}
	}

}

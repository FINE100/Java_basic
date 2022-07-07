package co.yedam;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 문제 3: 배열사용.
 * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
 * 저장 된 값중에서 가장 작은 값과 배열요소의 평균을 구하는 기능을 작성하세요.
 * 출력 예 : [5, 6, 7] 가장 작은 값: 5, 평균: 6.0
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[3];
		
		int sum =0;
		double avg =0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자를 입력하세요");
			arr[i] = scn.nextInt();
			sum += arr[i];
			} 
			avg = (double)sum/arr.length;
		
			int max = arr[0];
			int min = arr[0];
	for(int i=0; i<arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}else if(min> arr[i]){
			min = arr[i]; 
		}
		
		
	}
	System.out.println("출력예:"+Arrays.toString(arr));
	System.out.printf("가장 작은 값: %d, 평균 : %.1f\n", min, avg);
	System.out.printf("가장 큰 값: %d, 합계 : %d",max, sum);
	}
}

		

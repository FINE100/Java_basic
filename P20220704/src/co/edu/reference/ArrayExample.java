package co.edu.reference;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기 : 5, intAry.length
		
		// 위치 세번째 값 15 -> 30 바꾸기, 첫번째 값과 두번째 값 바꾸기
	//	intAry[3] = 30;
		int temp = intAry[0];
     	intAry[0] = intAry[1];
		intAry[1] = temp;
		// 누적 합계 구하기
		int sum = 0;
		for(int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("합계 : " +sum);
		
		// 조건: 25보다 큰 숫자만 출력
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > 25) {
				System.out.println("25보다 큰 수는 " + intAry[i]);
			}

		} // 조건: 짝수만 출력하라
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				System.out.println("짝수는 " + intAry[i]);
			}
		} // 조건: 첫번째, 세번째, 다섯번째 값만 출력하라
		for (int i = 0; i < intAry.length; i++) {
			if (i % 2 == 0) { // 인덱스 값 설정, 첫번쨰, 세번쨰, 다섯번쨰는 [0][2][4] 이므로 짝수 구하듯 구함
				System.out.println("홀수 번째 값은 " + intAry[i]);
			}
		}

	}
} // 디버깅해보기 (**)
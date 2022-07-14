package co.yedam;

/*
 * 문제1: 정수형 변수 num1, num2를 선언하세요. 
 * 두변수에 각각 임의의 값을 저장을 한다면 두 수 중에서 큰수에서 작은 수를 뺀 결과를 result 변수에 대입하는 코드를 작성하세요.
 * 출력 예) 35 - 27 의 결과 8.
 */
public class Exam01 {
	public static void main(String[] args) {
		int num1 = 0; 
		int num2 = 0;
		int result = 0;  // 정수(int)형 변수 선언 

		num1 = 35;
		num2 = 27;		// 정수 선언, 언제든지 바꾸어 선언할 수 있는 값 

		if (num1 > num2) {				// 조건문 if ~ else 사용 
			result = num1 - num2;		// num1 > num2 일 경우 
		} else {						// num1 < num2 일 경우 (두번쨰가 더 클 수도 있으므로)
			result = num2 - num1;
		}
		System.out.println(result); 	//result에 출력 
	}

}

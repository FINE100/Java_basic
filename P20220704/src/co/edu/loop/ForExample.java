package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("i의 값:" + i + ", sum의 값 :" + sum);
			}
		}
		System.out.println("짝수 합 : " + sum);

		// 1 ~ 10까지 result => 누적
		// 1,3,5,7,9, => 누적
		//1,4,7,10 => 누적

		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;

		}
		System.out.println("1~ 10까지 누적 합 :" + result);
				
		int result2= 0;
		for (int i = 1; i <= 10; i+=2) {
			result2+= i;

	}
		System.out.println("홀수적 합 :" + result2);
		
		int result3 = 0;
		for (int i = 1; i <= 10; i+=3) {
			result3+= i;
			
} 
		System.out.println("1,4,7,10의 합 :" + result3);
		
		
		// 1 ~ 10까지 출력
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		// 10 ~ 1까지 출력
		for(int i =10 ; i>=10; i--) {
			System.out.println(i);
		}
	}
}

package co.edu.loop;

public class Example01_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, sum;
		sum = 0;

		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum += num;
				System.out.println(num + " , " + sum);
			}
		}
		System.out.println("2의 배수의 합계: " + sum);
		// 2의 배수의 합 : 22??
		

		// 2또는 3의 배수 합계
	
		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0 || num % 3 == 0) {
				sum += num;
				System.out.println(num + " , " + sum);
			}
		}
		System.out.println("2 또는 3의 배수 합계 : " + sum);

	
	}
}
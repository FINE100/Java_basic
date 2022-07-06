package co.edu.loop;

public class Example01 {

	public static void main(String[] args) {

		// 3) 10번 반복
		// 1) num 변수 <= 1 ~ 10까지의 임의 정수. Math.random();
		// 2) sum 변수 <= 2의배수

		int num, sum2, sum3;
		sum2 = sum3 = 0;

		for (int i = 1; i <= 10; i++) {

     		num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) { // 2의 배수를 sum2에 누적
				sum2 += num;
			}
			if (num % 3 == 0) { // 3의 배수를 sum3에 누적
				sum3 += num;
			}

		}
		System.out.println("2의 배수 합계 : " + sum2);
		System.out.println("3의 배수 합계 : " + sum3);

		// 2의 배수의 합 : 22??
 }
}

//	 내가 친 코드.. 비교해보기
//      int num = (int)(Math.random()*10);
//		System.out.println(num);
//		
//		
//		int sum = 0;
//		for (int i = 1; i <= 10; i+=2) {
//			sum += i;
//			}
//				System.out.println(sum);

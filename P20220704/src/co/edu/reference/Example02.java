package co.edu.reference;

public class Example02 {

	public static void main(String[] args) {
		// while 반복문을 사용
		// 1 ~ 10까지 출력
		// 1~ 10까지 합계
		
			int i = 1;
			while(i <= 10) {
				System.out.println("i의 값 >> " + i);
				i++; 
		
		}
		int sum = 0;
		i = 1;
		while(i<=10) {
			sum += i;
			i++;
		} System.out.println("합계 : " + sum);

	}

}

package co.edu.reference;

public class Example01 {

	public static void main(String[] args) {
		//1~100 수를 출력 (for 반복문)
		//짝수만 출력
		//누적 합계
			   
 	  	  for(int i = 0; i<=10; i++) {
			System.out.println(i);}
			
			for (int i = 0; i <= 10; i++) {
				if (i%2 != 0) {
					continue;
				} System.out.println("i의 값:" + i );
				}
					
					int sum = 0;
					for (int i = 0; i <= 10; i++) {
						 sum += i;{
						
						System.out.println("누적합계:" + sum);	
				}
				}
	}
}


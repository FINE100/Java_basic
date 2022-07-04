package co.edu;
import java.util.Scanner;

public class EXample01_ex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("임의의 숫자 입력 >>");
		int num1 = scn.nextInt();
		
		//3의 배수 => 입력 n은 3의 배수입니다. 입력 n은 3의 배수가 아닙니다다.
		
		boolean is3Times = num1%3 == 0;
		if (is3Times) {
			System.out.printf("입력값 %d는 3의 배수입니다.",num1);
		}else {
			System.out.printf("입력값 %d는 3의 배수가 아닙니다.",num1);
		}
    }
}
package co.edu;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {

		System.out.println("[필수 정보 입력]");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.이름: ");
		String name = scanner.nextLine();

		System.out.println("2.주민번호 앞 6자리: ");
		String passwd = scanner.nextLine();

		
		System.out.println("3.전화번호: ");
		String number = scanner.nextLine();
		
		System.out.println();		
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름 : " + name);
		System.out.println("2. 주민번호 앞 6자리 : " +passwd);
		System.out.println("3. 전화번호 : " + number);
		
		
		
	}

}

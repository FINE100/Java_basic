package co.edu.reference;

public class NestLoopExample01 {

	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) {
			System.out.println("j의 값 : " + j);
			for (int i = 1; i <= 5; i++) {
				System.out.println("  i의 값 : " + i);
			}

		}
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d * %d = %d\n", j, i, (j * i));
			}
			System.out.println();
		}
//*
//**
//***
//**** 별찍기

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//----*4
//---**3
//--***2
//-****	1	

		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}

	}
}

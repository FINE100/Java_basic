package co.edu.reference;

public class MethodExample01 {
	public static void main(String[] args) {

		// 실행구문.
//		long sum = sum(10); //arguments(매개값)
//		showInfo("김희진", 25);
//		showInfo("김연경", 33);
//		printStar(4, "★");
//		printlove(12, "♥");

//		for(int i =2; i<=5; i++)
//		printGugudan(i);
		newGugudan();

	}

	public static void newGugudan() {
		
		for (int i=2; i<=9; i++) {
			for(int j=1; i<=9; i++) {
				
				
				System.out.printf("%d * %d = %d   ", i, j, (i*j));
				
			}
		} 
	}

	public static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
	}

	public static void printlove(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			System.out.print(shape);
		}
	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다~ 나이는 " + age + "살 입니다!");
	}

	// 정의구문.
	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return result; // 자동형변환(promotion)
	}
}

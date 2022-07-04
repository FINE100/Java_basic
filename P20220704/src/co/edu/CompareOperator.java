package co.edu;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		// ==, !=, >, >=, <, <=

		if (num1 == num2) {
			System.out.println("두 수가 같습니다.");
		}

		if (num1 != num2) {
			System.out.println("두 수가 다릅니다.");
		}

		num1 = 20; // num2 = 20;

		if (num1 >= num2) {
			System.out.println("num1이 num2보다 크거나 같습니다.");
		}

		// 클래스의 값 비교. String
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 + ", " + name2);

		// if(name1 == name2) {
		if (name1.equals(name2)) { // 문자열을 비교할 경우에는 equals()
			System.out.println("두 값이 동일합니다.");
		} else {
			System.out.println("두 값이 동일하지 않습니다.");
		}

		String result = (name1.equals(name2)) ? "두 값이 동일합니다" : "두 값이 동일하지 않습니다";

		// 삼항 연산자.
		boolean isTrue = false;
		if (num1 > num2) {
			isTrue = true;
		} else {
			isTrue = false;
		}

		// 위의 if(num1<num2)~~~ false와 같은 내용! 삼항자로 한줄로 요약가능!
		// 앞에 반환값 있어야함. 지금은 참,거짓 판별이므로 반환값인 boolean 앞에 있어야함
		isTrue = (num1 > num2) ? true : false;
		result = (num1 > num2) ? "true" : "false"; // 문자열 반환시 boolean 안됨 => String result
	}
}
package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 127;						 //byte : 1byte (8bit) =>  - 128 < byte < +127까지 표현 가능
		short s1 = 32767;					//short : 2byte (16bit) => -32768 < short < 32767
		int n1 = 0;							//  int : 4byte(32bit) => -2147483648 < int < 2147483647
		long l1 = 8L;						// long : 8byte(64bit) => -9223372036854775808 < long < 9223372036854775807
		
		
		int result = b1 + 20; 				// 같은 타입끼리 연산해야함 => int 형으로 변형
		long result1 = l1 + (long) 20;		// 데이터타입 변환 : 자동형변환(promotion) 
		result = (int) l1 + 20;             // 데이터 타입 변환 : 강제형변환(casting)
		
		System.out.println(result);			
		System.out.println(result1);
		
		char c1 = 'A';
		//	c1++ ;  //int 타입이 아니므로 ++ 로 표기
		
		for(int i=0 ; i<25; i++) {
			System.out.println((int)c1++);
		}
		//이력 변경 추가 2022.07.01
		System.out.println("이력변경추가.");
		
		//깃에서 추가한 정보입니다.
		System.out.println("깃이력변경추가.");
		
	}
}

























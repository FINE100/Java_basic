package co.edu.reference;

public class ArrayExample01 {

	public static void main(String[] args) {
		// 배열의 저장공간 선언.
		int[] intAry = new int[10]; 		// 저장공간 10개인 객체.
												// byte,short,int,long => 초기값 0
		intAry[0] = 10; 						// 첫번째 위치 10값을 할당.
		intAry[4] = 50;
		System.out.println(intAry.length);  	// 배열 크기를 알려주는 읽기 속성 .length

		for (int i = 0; i < 10; i++) {

			System.out.println(intAry[i]); 		 // 값이 설정되어 있지 않으면 초기값 0으로 나옴

		}
		
		double[] dblAry = new double[5];		// double 형 공간 5개 선언. 초기값 0.0
		for(int i =0; i < 5; i++) {
			System.out.println(dblAry[i]);
		}
		
		boolean[] boolAry = new boolean[3];			//boolean형 초기값 false
		boolAry [1] = true;
//		boolAry [2] = "true"; 						// boolAry에는 boolean형만 대입할 수 있음. 문자열 못 담음.
		for (int i = 0; i <boolAry.length; i++){
			System.out.println(boolAry[i]);
		}
		
		String[] strAry = {"노은경","김민지","백진희"};	//3개의 값을 할당
//		strAry[3] = "황경영";							//실행오류 발생. 번지수가 없으므로
		strAry[2] = "황경영";							//기존값이 있더라도 선언해서 값을 변경할 수 있음.
		for(int i = 0; i <strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	} 
}

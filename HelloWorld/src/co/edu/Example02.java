package co.edu;

public class Example02 {
	//나의 키 : 변수, 친구의 키 :변수 
	
	
	// 나의 키가 더 큽니다.
	// 나의 키가 더 작습니다.
	
	
	public static void main(String[] args) {
		
		double myHeight = 165.0;
		double yourHeight = 172.2;
		
		double theDifference = 0;
	
		if(myHeight>yourHeight) {
			theDifference = myHeight - yourHeight;
			System.out.println("나의 키가 " + Math.round(theDifference*100)/100.0 + "만큼 더 큽니다.");
		} else {
			theDifference = yourHeight - myHeight;
			System.out.println("나의 키가 " + Math.round(theDifference*100)/100.0 + "만큼 더 작습니다");
		}

	}
	
}

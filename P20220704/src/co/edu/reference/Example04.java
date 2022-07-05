package co.edu.reference;

public class Example04 {

	public static void main(String[] args) {
		// A반 학생 점수 80, 85, 83
		// B반 학생 점수 79, 84, 90

		int[][] banAry = new int[2][3];
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;

		System.out.println(banAry[0].length);
		//A반 평균.
		int sum = 0;						
		for (int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
			
		}
		System.out.printf("A반의 평균은 %.1f \n", (double) sum / banAry[0].length);

		//B반 평균
		sum =0;
		for (int i = 0; i < banAry[1].length; i++) {
			sum += banAry[1][i];
			
		}
		System.out.printf("B반의 평균 %.1f \n", (double) sum / banAry[1].length);

	}
}
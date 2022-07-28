package lesson7;

public class Sample3 {
	public static void main(String[] args) {

		int[] test = new int[5];
		//배열 변수는 test 

		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i = 0; i< test.length; i++) {
			System.out.println((i+1)+"번째 사람의 점수는 " + test[i] + "입니다. " );
		}
	}
}

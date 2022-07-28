package lesson7;

public class Sample5 {

	public static void main(String[] args) {
		
		int[] test1 = new int[3];
		System.out.println("test1을 선언했습니다.");		
		System.out.println("배열 요소를 생성했습니다.");
		
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;
		
		int[] test2;
		System.out.println("test2을 선언했습니다. ");
		test2 = test1;
		System.out.println("test2에test1을 대입했습니다 .");
		

		for(int i=0; i<test1.length; i++) {
			System.out.println("test1이 가리키는 " + (i+1)+ "번째 사람의 점수는 " + test1[i] + "입니다. ");
		}
		
		for(int i=0; i<test2.length; i++) {
			System.out.println("test1이 가리키는 " + (i+1)+ "번째 사람의 점수는 " + test1[i] + "입니다. ");
		}
		
	}
}

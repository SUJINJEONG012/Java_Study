package practiceproblem;

import java.util.Scanner;

public class Page123_1number {

	public static void main(String[] args) {
		
//		// while문을 가진 프로그램에 대해 물음에 답하라
//		int i = 0;
//		int sum = 0;
//		
//		while(i < 10) {
//			i = i + 2 ;
//			System.out.println("i"+i);
//			sum += i;
//			System.out.println("sum :"+ sum);
//		}
//		System.out.println(sum);
//		
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를입력하세요 (10,20) : ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	
	int sum = a+b;
	
	System.out.printf("%d와 %d의 합은 : %d", a, b,sum);
	
	//System.out.println("10 + 20 = :" + a + b);
			
	

	}

}

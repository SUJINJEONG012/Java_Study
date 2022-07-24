package repetitionsandArrays;

import java.util.Scanner;

public class While__ {

	public static void main(String[] args) {

		// while 문을 이용하여 정수를 어려개 입력받고 평균을 출력

		Scanner scanner = new Scanner(System.in);

		int count = 0, n = 0;
		double sum = 0;// sum
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

		
		//while 조건이 참일경우 계속실행 
		while ((n = scanner.nextInt()) != 0) {
			sum = sum + n;
			count++;
		}
		System.out.println("수의 개수는 " + count + "개며,");
		System.out.println("평균은  " + sum / count + " 입니다.");
		scanner.close();

	}
}

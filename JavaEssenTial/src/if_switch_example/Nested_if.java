package if_switch_example;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// 점수와 학년을 입력받아60점이상이면 합격, 아니면 불합격
		// 다만, 4학년은 70점 이상이어야 합격
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요. (0~100점):");

		int score = scanner.nextInt(); // 점수읽기
		System.out.print("학년을 입력하세요. (1~4학년):");
		int years = scanner.nextInt(); // 학년읽기
		

		if (score >= 60) {

			if (years != 4) {
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격 ");
			}
		} else { // 60점미만불합격
			System.out.println("불합격!");
		}
		//스캐너 닫기
		scanner.close();

	}

}

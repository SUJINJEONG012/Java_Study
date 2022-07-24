package practiceproblem;

import java.util.Scanner;

public class Page84 {

	public static void main(String[] args) {

		// 두사람이 가위바위보 "철수" "영희"
		// 1 먼저 철수를 출력하고 "가위" "바위" "보"를 문자열로 입력받는다.

		Scanner scanner = new Scanner(System.in);

		System.out.print("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		String result = scanner.next();

		String p1 = "철수 ";
		String p2 = "영희 ";
		
		if(result.equals("가위")) {
			System.out.println("철");
		}else{}

	}
}

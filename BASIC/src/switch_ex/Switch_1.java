package switch_ex;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {

		System.out.println("메뉴");
		System.out.println("======");
		System.out.println("1.프린트 '헬로우!'");
		System.out.println("2.프린트 '안녕?'");
		System.out.println("3.프린트 '프로그램 종료'");

		Scanner scanner = new Scanner(System.in);
		System.out.println("옵션을선택 ");
		int option = scanner.nextInt();
		scanner.close();

		switch (option) {

		case 1:
			System.out.println("헬로우 ");
			break;
		case 2:
			System.out.println("안녕?");
			break;
		case 3:
			System.out.println("프로그램종료 ");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다.");
			break;
		default:
			System.out.println("옵션이 없습니다. ");
			break;

		}

	}

}

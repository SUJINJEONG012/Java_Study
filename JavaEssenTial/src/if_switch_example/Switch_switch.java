package if_switch_example;

import java.util.Scanner;

public class Switch_switch {

	public static void main(String[] args) {
		// 1~12 사이의 월을 입력받아 봄,여름,가을,겨울을판단하여 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("1월에서 ~ 12월 사이의달을 입력하시면 계절이 나옵니다.");
		int month = scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
	scanner.close();

	}

}

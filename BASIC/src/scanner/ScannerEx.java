package scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "hello";
		boolean accessOK = false;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("비밀번호를 입력하세요,");
			String password = scanner.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속가능");
				accessOK = true;
				break;
			}else {
				System.out.printf("비밀번호가 틀렸습니다.(%d)\n",i);
			}

		}

		scanner.close();

		if (!accessOK) {
			System.out.println("접속거부");
		}
	}
}

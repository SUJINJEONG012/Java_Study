package parameters05;

public class App {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int num = 5;

		// 매개변수 들고오기

		//칼큘레이터 객체를 만든 후 그 메서드를 square를 메서드를 입력하여 이용
		int result = calculator.square(num);
		System.out.println(result);

		// 2.
		System.out.printf("%d의 더하기는 %d는 %d이다 \n", 12, 3, calculator.plus(12, 3));
		
		// 3, 변수에할당해서
		result = calculator.minus(12, 33);
		System.out.printf("두 수의 차이값은 %d 이다 \n", result);
	}

}

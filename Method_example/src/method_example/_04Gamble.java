package method_example;

public class _04Gamble {

	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득금액: $%.2f(%.0f원 )", dollar, won);

	}

	public static int dice(){
		// Math.random() 메서드를 활용하여 1~6 사이의 정수를 반환 
		int random = (int)(Math.random()* 6) +1; 
		System.out.println("random");
		return random;
	}

	private static double exchange(double dollar) {
		// 입력받은 달러를 환전하여 반
		return dollar * 1082.25108;
	}

}

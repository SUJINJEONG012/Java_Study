package method_example;

public class _02Pork {

	public static void main(String[] args) {
		// 삼겹살 1인분의 무게는 180g이고, 또 삼겹살 1g의 칼로리가 5.179 kcal
		// 삼겹살 3인분의칼로리를 소수점 이하 둘째자리 까지 출력

//변수생성
		int n = 3;

//메소드를 통한 칼로리계산
		double result = calorie(n);
//소수점 둘째짜리 %d정수로 ,%s 문자열형식으로 출력,  %f 소수점형식으로 출력
		System.out.printf(" 소모칼로리 %d : %.2f kcal ", n, result);

	}

	private static double calorie(int 인분) {
		return (인분 * 180 ) * 5.179;
	}

	

}

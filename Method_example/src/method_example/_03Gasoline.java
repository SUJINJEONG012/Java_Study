package method_example;

public class _03Gasoline {

	public static void main(String[] args) {
		//일단 변수 생성,
		double gasoline = 8.86; //가솔린
		double distance = 182.736; //거리
		//메서드 생성
		double efficiency = calcEffiency(gasoline, distance);
		System.out.printf("연비: %.2f km/L", efficiency);

	}

	private static double calcEffiency(double fuel, double distance) {
		//연료,거리 => 연비계산
		return   distance/fuel;
	}

}

package lesson8;

//인수가 있는 메서드
class Car5{
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호를 " + num + "으로 연료량을 " + gas + "로 바꾸었습니다." );
	}
	
	void show() {
		System.out.println("차량번호는 " + num + "입니다. ");
		System.out.println("연료량은 " + gas + "입니다. ");
	}
}
public class Sample5 {
	public static void main(String[] args) {
		
		Car5 car5 = new Car5();
		
		int number = 1234;
		double gasoline = 30.5;
		
		car5.show();
		car5.setNumGas(number, gasoline);
	}
}

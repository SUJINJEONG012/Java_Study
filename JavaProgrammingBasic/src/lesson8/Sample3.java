package lesson8;

class Car2{
	int num;
	double gas;
	
	void show() {
		System.out.println("차량번호는 " + num + "입니다. ");
		System.out.println("연료량 " + gas + "입니다. ");
		
	}
	
	void showCar() {
		System.out.println("지금부터 자동차의 정보를 표시합니다. ");
		show();
		
	}
}
public class Sample3 {

	public static void main(String[] args) {
	Car2 car2 = new Car2();
	
	car2.num = 123;
	car2.gas = 30.4;
	
	car2.showCar();
	
	}
}

package lesson8;

class Car1{
	int num;
	double gas;
	
	void show() {
		System.out.println("차량 번호는 " + num + "입니다. ");
		System.out.println("연료량은 " + gas + "입니다. ");
	}
}
public class Sample2 {
	public static void main(String[] args) {
		
		Car1 car1 = new Car1(); //객체생성
		car1.num = 1234;
		car1.gas = 20.5;
		car1.show();
		car1.show();
	}
}

package lesson9;

//생성자를 오버로딩하기 

class Car3{
	private int num;
	private double gas;
	
	
	public Car3() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다. ");
	}
	
	public Car3(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호가 " + num +"이며, 연료량은 " + gas + "입니다. ");
		 
	}
	
	public void show() {
		System.out.println("차량번호는 " + num + "입니다.");
		System.out.println("연료량 " + gas + "입니다.");
	}
}


//객체가2개를 생성했으며,생성자를 오버로딩 할 수 있다.
public class Sample5 {
	public static void main(String[] args) {
	     Car3 car1 = new Car3();
	     car1.show();
	     
	     Car3 car2 = new Car3(1234, 50.4);
	     car2.show();
	}
}

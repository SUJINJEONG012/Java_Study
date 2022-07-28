package lesson9;

//오버로딩의 원리 이해하기 


class Car{
	
	private int num;
	private double gas;
	
	// 메서드 오버로딩 단, 메서드를 오버로딩 할 때에는 메서드의 인수형과 개수를 다르게 만들어야 합니다. 
	public void setCar(int n ) {
		num = n;
		System.out.println("차량번호를 " + num +"바꾸었습니다. ");	
	}
	public void setCar(double g ) {
		gas = g;
		System.out.println("연료량 " + gas +"바꾸었습니다. ");
	}
	
	public void setCar(int n, double g ) {
		num = n;
		gas = g;
		System.out.println("차량번호를 " + num +"바꾸었습니다. ");
		System.out.println("연료량 " + gas +"바꾸었습니다. ");
	}
	

	public void show() {
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료량 " + gas + "입니다.");
	}
	
}

public class Sample3 {

	//다형성 , 같은하나의 이름으로 상황에 맞추어 다른 기능을 가지는 것을 일컫는 말 
	//같은 클래스안에서 이름이 같지만, 인수의 형type과 개수가 다른 메서드를 선언할 수 있다.
	public static void main(String[] args) {
	Car car = new Car();
	car.setCar(1234, 12.3);
	car.show();
	
	System.out.println("차량번호만 변경되었습니다.");
	car.setCar(5678);
	car.show();
	
	System.out.println("연료량만 변경되었습니다.");
	car.setCar(34.5);
	car.show();
	}
}

package lesson9;
//생성자 

/*
 * 생성자는 리턴값이 없다. 
 * 클래스의이름이 생성자이름이다.
 *제한자 클래스 명 (인수목록) {문장}
 * */

class Car2 {
	private int num;
	private double gas;

	//생성자
	public Car2(){
	  System.out.println("자동차가 만들어졌습니다. !");
	}
	
	public void show() {
		System.out.println("차량번호는 " + num + "입니다.");
		System.out.println("연료량은 " + gas + "입니다.");
	}
}

public class Sample4 {
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		car2.show();

	}
}

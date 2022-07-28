package lesson8;

class Car3{
	int num;
	double gas;
	
	void setNum(int n) {
		num = n;
		System.out.println("차량번호를 " + num + "으로 바꿨습니다." );
	}
}
public class Sample4 {

	public static void main(String[] args) {
   
	Car3 car3 = new Car3();
	car3.setNum(1344);
	}
}

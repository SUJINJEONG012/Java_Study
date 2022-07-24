package instanceVariableMethod02;

public class Person {
	// 클래스 안에 만든 변수를 "인스턴스변수" 또는 "필드변수" 라고도 지칭 => 객체 생성시 생성 


	String name;
	int age;
	
	//클래스 안에 있는 함수를 메소드라고 부름
	void sayHello() {
		System.out.println("Hello! " + name);
	}
}

package instanceVariableMethod02;


public class app {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Angela";
		p1.age = 31;

		Person p2 = new Person();
		p2.name ="미키마우스";
		p2.age = 31;
		
		//출력하기
		System.out.println(p1.name);
		p1.sayHello();

		System.out.println(p2.name);
		p2.sayHello();
		
		
	

	}

}

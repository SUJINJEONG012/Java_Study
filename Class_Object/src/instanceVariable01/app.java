package instanceVariable01;

//클래스 생성, 여기에 만들어도되고, 따로 만들어줘도 됨

//난 따로 만들어줘서 아래쪽은 주석처리

//class Person {
//	String name;
//	int age;
//}

//app
//같은 패키지안에 있으면 import안해도 자동으로 연결
public class app {

	public static void main(String[] args) {

		// 클래스 설계도로 실제사용가능한 객체를 생성(메모리에 생성 )

		Person p1 = new Person();
		p1.name = "Angela";
		p1.age = 31;

		Person p2 = new Person();
		p2.name = "Niki";
		p2.age = 33;

		// 클래스 참조변수라, new 객체로 생성되순간, 메모리에 할당되면서 주소가 생김
		System.out.println(p1);
		System.out.println(p2);

		// 제대로 나오는지 출력 확인!
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println(p2.name);
		System.out.println(p2.age);

	}

}

package gettersAndsetters;

public class App {

	public static void main(String[] args) {
		// 클래스명과 동일하게 객체생성
		Person p1 = new Person();

		// 선언할땐,setName
		p1.setName("펭수 ");
		p1.setAge(20);

		// 출력할때나, 가지고올땐 getName
		System.out.printf("%s \t", p1.getName());
		System.out.println(p1.getAge()+ "살");

		Person p2 = new Person();
		p2.setName("둘리");
		p2.setAge(4);
		
		System.out.println(p2.getName());
		System.out.printf("%d살 \n" , p2.getAge());

	}

}

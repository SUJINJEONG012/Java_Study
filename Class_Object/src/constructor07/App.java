package constructor07;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("최유리 - 잘 지내자 우리",2022);
		Person p2 = new Person("정승환 - 잘 지내요",2019);
		Person p3 = new Person("임창정 - 슬픈 혼잣말",2010);
		
		// 원래느 이렇게 넣어줘야되는걸 생성자함수로 바로 변수를넣어서코드를 간결하게 표
//		p1.setSinger("최유리 - 잘 지내자 우리");
//		p2.setSinger("정승환 - 잘 지내요");
//		p3.setSinger("임창정 - 슬픈 혼잣말");
//		
//		p1.setYears(2022);
//		p2.setYears(2019);
//		p3.setYears(2010);

		
		//출력 
		System.out.printf("%s \t", p1.getSinger());
		System.out.println(p1.getYears());
		
		System.out.printf("%s \t   ", p2.getSinger());
		System.out.println(p2.getYears());
		
		System.out.printf("%s \t", p3.getSinger());
		System.out.println(p3.getYears());

	}

}

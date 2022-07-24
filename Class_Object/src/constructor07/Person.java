package constructor07;

public class Person {

	private String singer;
	private int years;

	// 기본생성자는 생략가능, 객체가 만들어질때 실행

//	public Person() {
//		// 기본 생성자는public 클래스명
//		System.out.println("최애 가수 생성!");
//	}

	public Person(String singer, int years) {
		super();
		this.singer = singer;
		this.years = years;
	}
	
	

	//private는 get,set 함수로 불러와야 한다.
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String getSinger(){
		return singer;
	}
	
	public void setYears(int years) {
		this.years= years;
	}
	
	
	public int getYears() {
		return years;
	}
	
	
	
	
	
	
	

	
	

}

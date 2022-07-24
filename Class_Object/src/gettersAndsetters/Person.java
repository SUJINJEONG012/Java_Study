package gettersAndsetters;

public class Person {

	//인스턴스변수에 직접 접근이 되면 안됌 (get,set 메서드 이용)
	private String name;
	private int age;
	
	// 접근가능하게 메서드를 생성
	// set 메서드는 필드변수의 값에 입력받은 값을 넣어준다.
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age; //this는 인스턴스
	}
	
	//get은 리턴값이 있어야 함.
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}

package MethodReturn04;

public class App {

	public static void main(String[] args) {

		// 객체생성 class 이름으로 객체를 생성
		ReturnValue rv = new ReturnValue();

		// 변수에 메서드로 불러오기

		System.out.println(rv.getCat());

		String value = rv.getCat();
		System.out.println(value);
	}

}

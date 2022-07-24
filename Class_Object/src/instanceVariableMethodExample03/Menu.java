package instanceVariableMethodExample03;

public class Menu {
    //자바 배열, 글자라서 String 타입 
	String[] options = {"아이템 보기","아이템 추가","아이템 삭제","종료"};
	
	void display() {
		System.out.println("메뉴를 선택 : ");
		//for 문으로 배열 길이만큼 반복 돌림
		for(int i = 0; i < options.length; i++) {
			//출력포맷으로 %d, %s를 출력하기위해뒤에, 인덱스번호랑, 옵션값 출력
			System.out.printf("%d. %s \n" , i,  options[i]);
		}
	}
}

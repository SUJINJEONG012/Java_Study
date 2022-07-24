package repetitionsandArrays;

public class DoWhile {

	public static void main(String[] args) {
		
		
		//'a'에서 'z' 까지 출력하는 코드
		
		char a = 'a';
		
		do {
			System.out.print(a); // 문자출력 
			a = (char) + (a+1);  // 알파벳의 경우1을 더하면 다음 문자의 코드 
		}while(a <= 'z');
	}
}

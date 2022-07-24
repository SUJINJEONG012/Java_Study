package repetitionsandArrays;

public class Repetitions {

	public static void main(String[] args) {
		//for 문을 이용하여1부터 10까지 합 출력
		//1부터 10까지 덧셈으로 표시하고 합을 출력
	   int sum = 0;
	   
	   for(int i = 0; i <= 10; i++) {
		   sum += i;
		   System.out.print(i); //출력하는 수 보여주기
		   
		  if(i <= 9) {
			  System.out.print("+");
		  }else {
			System.out.println("=");
			System.out.println(sum); // 덧셈결과
		  }
	   }

	}

}

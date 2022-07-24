package method_example;

public class _13Salary {

	public static void main(String[] args) {
		// 급여계산

		// 급여는 주급으로 정산하며 (근무시간) X (기본 시급)을 기준
		// 주당 근무가 40시간을 초과 시, 초과분에 대하여 1.5배의 급여를 지급한다.
		// 기본 시급은 최저 $8.00이며, 이보다 작은 경우 경고문을 출력한다.
		// 주당 근무가 60시간을 넘을 시, 경고문을 출력한다.
		// 위 내용을 만족하는 printPay() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.

		// $ 400.00 //$ 550.00 //최저 시급 에러! //초과 근무시간 에러!

		// 순서도 정하기
		// 1. 주당근무시간 변수로 지정, 기본시급변수에 지정
		// 2. 주당근무가 월급 !, 조건문으로 조건걸기 !

		// printPay() 메인 메서드 , 메서드인자 => 그 메서드에 인자를 전달
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);

	}

	private static void printPay(double basePay, int hours) {//인자, 시급과 일한시간
		// TODO Auto-generated method stub
		// 변수는 메서드()안에넣기
		//pay시간 
		double pay = 0.0;
		//최저시급보다 작을 경우
       if(basePay < 8) {
    	   System.out.println("최저시급에러!");
       }else if(hours > 60) {
    	   System.out.println("초과 근무시간에러!");
       }else if(hours > 40) {
    	   
    	   System.out.println();
       }else {
    	   return false;
       }
		System.out.printf("$ %.2f\n", pay);

	}

}

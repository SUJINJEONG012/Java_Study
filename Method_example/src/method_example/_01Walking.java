package method_example;

public class _01Walking {

	public static void main(String[] args) {
	 
		double result  = calculateCalory(5000);
		System.out.println("소모칼로리 :  " +result + "Kcal");
	}

	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
	

	

}

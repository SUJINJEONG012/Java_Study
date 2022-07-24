package array_rep;

class DailyUser {

	public static void main(String[] args) {
		//배열 생성
		int[] users = {581, 512, 527, 495, 423, 141, 236};
		
		//총 유저 계산
		double totalUsers = sum(users);
		System.out.printf(" 총 사용자: %.0f \n", totalUsers);
		
        double dailyUser = average(totalUsers, users.length);
        System.out.printf(" 하루평균사용자 : %.0f\n", dailyUser);
	}


	private static double sum(int[] arr) {
		double sum =0;
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	private static double average(double sum, int count) {
		
		return sum/count;
	}


	
	

}

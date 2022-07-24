package method_example;

public class _06ProgrammingGrade {

	public static void main(String[] args) {
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;

		// 결과출력
		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score1, grade(score2));
		System.out.printf("%d점 -> %s\n", score1, grade(score3));
	}

	private static String grade(int score) {
		String grade = "";
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A0";
		} else if (score >= 80) {
			grade = "B+";
		} else if (score >= 70) {
			grade = "B0";
		}
		return grade;
	}

}
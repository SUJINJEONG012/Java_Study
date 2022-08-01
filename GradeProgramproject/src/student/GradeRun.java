package student;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeRun {

	Scanner scanner = new Scanner(System.in);

	String name = null;
	int koScore = 0, enScore = 0, mathScore = 0;

	
	// 학생배열
	private ArrayList<Student> students = new ArrayList<>();
	public void setExistingStudent(String stName, int koScore, int enScore, int mathScore) {
		students.add(new Student(stName, koScore, enScore, mathScore));
	
	}


	// 메인 첫 화면에 보여질 콘솔창
	public void firstShow() {

		try {
			System.out.println("=============================");
			System.out.println("[1] 나의 성적조회");
			System.out.println("[2] 학생 성적조회");
			System.out.println("=============================");

			System.out.print("원하시는 '서비스번호' 를 입력해주세요 : ");
			int numChoice = scanner.nextInt();

			switch (numChoice) {
			case 1:
				// 나의 성적조회 메서드만들어서 이동
				myGrade();
				break;
			case 2:
				// 학생조회 메서드만들어서 이동
				studentGrade();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.exit(0);
				break;
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}

	}


	

	// 나의성적조회 메서드
	private void myGrade() {

		try {

			System.out.println("===== 본인의 등급을 확인하실려면 입력해주세요. =====");
			System.out.print("이름을 입력해주세요 : ");
			name = scanner.next();

			System.out.print("국어점수를 입력해주세요 : ");
			koScore = scanner.nextInt();

			System.out.print("영어점수를 입력해주세요 : ");
			enScore = scanner.nextInt();

			System.out.print("수학점수를 입력해주세요 : ");
			mathScore = scanner.nextInt();

			int total = koScore + enScore + mathScore;// 총합
			float avg = (float) (total)/3;// 평균값

			// 삼항조건연산자
			String grade = (avg >= 90) ? "A" : (avg >= 80) ? "B" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : (avg >= 60) ? "D" : "F";

			System.out.println("============================================");
			System.out.println( "******  " + name + " 성적표 ******");
			System.out.println("성적총합은 " + total + "점 입니다.");
			System.out.printf("성적  성적평균은 %.01f점 입니다. \n", avg  );
			System.out.println(name + "님의 등급은 " + grade + "등급 입니다.");
			System.out.println();

		} catch (Exception e) {

			System.out.println("숫자만 입력해주세요. ");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);

		}

	}
	

	// 학생조회 메서드

	private void studentGrade() {
		System.out.println("========================");
		System.out.println("학생 데이터 조회 결과 " + students.size()+" 계정이 존재합니다");	 
		students.forEach(s -> System.out.println(s.toString()));
	}
	
	
	

	
}

package application;

import student.GradeRun;

public class App {

	public static void main(String[] args) {
		// 객체만들기
				GradeRun gradeRun = new GradeRun();

				gradeRun.setExistingStudent("Angela", 100, 60,50);
				gradeRun.setExistingStudent("Niki", 100, 60, 50);
				gradeRun.setExistingStudent("Agath", 40, 60, 20);
				gradeRun.setExistingStudent("Wellamson", 50, 60, 80);
				gradeRun.setExistingStudent("Niki", 100, 100, 90);
				gradeRun.setExistingStudent("Willy", 100, 100, 90);
				
				gradeRun.firstShow();
				
	}
}

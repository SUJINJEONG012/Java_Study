package student;

public class Student {

	// 인스턴스 변수 또는 필드변수 생성
	protected String StName; // 학생이름
	protected int koScore; // 국어점수
	protected int enScore; // 영어점수
	protected int mathScore; // 수학점수
	protected int total; // 총합
	protected float avg; // 평균
	protected String grade; // 등급


	// 생성자
	public Student(String stName, int koScore, int enScore, int mathScore) {
		StName = stName;
		this.koScore = koScore;
		this.enScore = enScore;
		this.mathScore = mathScore;
		this.total = koScore + enScore + mathScore;
		this.avg = total/3;
		this.grade = (avg >= 90) ? "A" : (avg >= 80) ? "B" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : (avg >= 60) ? "D" : "F";
	}
	

	public void setStName(String stName) {
		StName = stName;
	}

	public String getStName() {
		return StName;
	}

	public void setKoScore(int koScore) {
		this.koScore = koScore;
	}

	public int getKoScore() {
		return koScore;
	}

	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}

	public int getEnScore() {
		return enScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public float getAvg() {
		return avg;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "학생 성적조회 [이름 = " + StName + ", 국어점수 = " + koScore + ", 영어점수 = " + enScore + ", 수학점수 =" + mathScore
				+ ", 총합 = " + total + ", 평균 = " + avg + ", 등급 = " + grade + "]";
	}
	
}

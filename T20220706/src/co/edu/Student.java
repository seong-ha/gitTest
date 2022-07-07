package co.edu;

public class Student {
	private String sno;
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showInfo() {
		System.out.printf("학번: %s, 이름: %s, 점수: %s\n", sno, name, score);
	}
}

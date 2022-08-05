package com.yedam.student;

public class StudentDTO {
	private int studentId; // 학번
	private String studentName; // 이름
	private String studentClass; // 강의실
	private String studentAddr; // 주소
	private String studentPhone; // 전화번호
	private int studentKor; // 국어
	private int studentEng; // 영어
	private int studentMath; // 수학

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public int getStudentKor() {
		return studentKor;
	}

	public int getStudentEng() {
		return studentEng;
	}

	public int getStudentMath() {
		return studentMath;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}

	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}

	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}

	
	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentAddr=" + studentAddr + ", studentPhone=" + studentPhone + "]";
	}

	public String score() {
		return "StudentDTO [studentKor=" + studentKor + ", studentEng=" + studentEng + ", studentMath=" + studentMath
				+ "]";
	}
}

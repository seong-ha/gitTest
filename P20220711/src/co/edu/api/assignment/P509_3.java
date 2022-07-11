package co.edu.api.assignment;

import java.util.HashMap;

public class P509_3 {

	public static void main(String[] args) {
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		hashMap.put(new Student("1"), "95");

		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s1 = (Student) obj;

			return studentNum.equals(s1.getStudentNum());
		}
		return false;
	}

}
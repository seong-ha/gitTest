package co.edu;

public class Course {
	private String tname;
	private String bname;
	private Student[] students;

	Course() {
	}

	Course(String tname) {
		this.tname = tname;
	}

	Course(String tname, String bname, int studentNum) {
		this.tname = tname;
		this.bname = bname;
		this.students = new Student[studentNum];
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void getStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].showInfo();
			}
		}
	}

	public void addStudents(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public Student getMaxScore() {
		int max = 0;
		Student student = new Student();

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && max < students[i].getScore()) {
				max = students[i].getScore();
				student = students[i];
			}
		}

		return student;
	}

	public double getScoreAvg() {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				count++;
				sum += students[i].getScore();
			}
		}
		
		double avg = (double) sum / count;
		
		return avg;
	}
//	public void showInfo() {
//		System.out.printf("선생님이름: %s, 반이름: %s, 학생수 %d",
//								tname, bname, students.length);
//	}
}

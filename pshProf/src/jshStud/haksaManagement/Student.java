package jshStud.haksaManagement;

/*
	student_id number primary key,
    student_name varchar2(10) not null,
    student_class varchar2(15),
    student_addr varchar2(20) not null,
    student_phone varchar2(15),
    student_kor number,
    student_eng number,
    student_math number
 */
public class Student {
	private int student_id;
	private String student_name;
	private String student_class;
	private String student_addr;
	private String student_phone;
	private int student_kor;
	private int student_eng;
	private int student_math;

	public int getStudent_id() {
		return student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public String getStudent_class() {
		return student_class;
	}

	public String getStudent_addr() {
		return student_addr;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public int getStudent_kor() {
		return student_kor;
	}

	public int getStudent_eng() {
		return student_eng;
	}

	public int getStudent_math() {
		return student_math;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public void setStudent_addr(String student_addr) {
		this.student_addr = student_addr;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}

	public void setStudent_kor(int student_kor) {
		this.student_kor = student_kor;
	}

	public void setStudent_eng(int student_eng) {
		this.student_eng = student_eng;
	}

	public void setStudent_math(int student_math) {
		this.student_math = student_math;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + ", student_addr=" + student_addr + ", student_phone=" + student_phone
				+ ", student_kor=" + student_kor + ", student_eng=" + student_eng + ", student_math=" + student_math
				+ "]";
	}

}

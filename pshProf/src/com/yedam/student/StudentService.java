package com.yedam.student;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);

	// 1. 학생 등록
	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		checkResult(result);
	}

	// 성적 입력(국영수)
	public void insertSubject(StudentDTO std) {

//		StudentManage.getInstance().getStudentDTO(0);

		// 1. 성적입력 -> 1. 국어 2. 영어 3. 수학
		System.out.println("======== 성적 입력 ========");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학");
		System.out.print("과목 선택");
		int menu = Integer.parseInt(sc.nextLine());

		System.out.println("점수 입력>");

		if (menu == 1) {
			int kor = Integer.parseInt(sc.nextLine());
			std.setStudentKor(kor);
			int result = StudentManage.getInstance().insertKor(std);
			checkResult(result);
		} else if (menu == 2) {
			int eng = Integer.parseInt(sc.nextLine());
			std.setStudentEng(eng);
			int result = StudentManage.getInstance().insertEng(std);
			checkResult(result);
		} else if (menu == 3) {
			int math = Integer.parseInt(sc.nextLine());
			std.setStudentMath(math);
			int result = StudentManage.getInstance().insertMath(std);
			checkResult(result);
		}
	}

	// 전화번호 수정
	public void updatePhone() {

		StudentDTO std = new StudentDTO();

		System.out.print("ID 입력> ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 전화번호 입력> ");
		String phone = sc.nextLine();

		std.setStudentId(id);
		std.setStudentPhone(phone);

		int result = StudentManage.getInstance().updatePhone(std);
		checkResult(result);
	}

	// 학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		return StudentManage.getInstance().getStudentDTO(std.getStudentId());
	}

	public void checkResult(int value) {
		if (value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}

package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberDTO;
import com.yedam.member.MemberService;
import com.yedam.student.StudentDTO;
import com.yedam.student.StudentService;

public class LMSApp {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();

	Scanner sc = new Scanner(System.in);
	int menu = 0;

	// 로그인 정보를 담는 객체
	MemberDTO MD = null; // 공유할거.

	public LMSApp() {
		run();
	}

	private void run() {
		while (true) {
			menuNo();
			// 로그인이 되지 않았을 때
			if (MD == null) { // 로그인 진행

				if (menu == 1) {
					MemberDTO member = new MemberDTO();

					System.out.println("아이디 입력>");
					String loginId = sc.nextLine();
					System.out.println("비밀번호 입력>");
					String loginPw = sc.nextLine();

					member.setMemberId(loginId);
					member.setMemberPw(loginPw);

					MD = ms.doLogin(member);
				} else if (menu == 2) {
					System.out.println("프로그램 종료");
					break;
				}
			} else { // 프로그램 진입

				if (menu == 1) { // 학생 등록
					StudentDTO std = new StudentDTO();

					System.out.println("ID 입력> ");
					int id = Integer.parseInt(sc.nextLine());

					System.out.println("이름 입력> ");
					String name = sc.nextLine();

					System.out.println("강의실 입력> ");
					String lecture = sc.nextLine();

					System.out.println("주소 입력> ");
					String addr = sc.nextLine();

					System.out.println("전화번호 입력> ");
					String phone = sc.nextLine();

					std.setStudentId(id);
					std.setStudentName(name);
					std.setStudentClass(lecture);
					std.setStudentAddr(addr);
					std.setStudentPhone(phone);

					ss.insertStudent(std);
				} else if (menu == 2) { // 학생 성적 입력
					StudentDTO std = new StudentDTO();
					System.out.print("ID 입력> ");
					int id = Integer.parseInt(sc.nextLine());

					std.setStudentId(id);

					if (ss.getStudent(std) != null) {
						ss.insertSubject(std);
					} else {
						System.out.println("존재하지 않는 학생입니다.");
					}

				} else if (menu == 3) { // 학생 정보 수정
					ss.updatePhone();
				} else if (menu == 4) { // 학생 정보 조회
					StudentDTO std = new StudentDTO();
					System.out.print("ID 입력> ");
					int id = Integer.parseInt(sc.nextLine());
					std.setStudentId(id);
					StudentDTO getStd = ss.getStudent(std);
					System.out.println(getStd.toString());
				} else if (menu == 5) {
					System.out.println("로그아웃");
					MD = null;
				} else {
					System.out.println("값을 잘못 입력하셨습니다.\n 다시 시도해주세요.");
				}
			}
		}
	}

	private void menuNo() {
		if (MD == null) {
			System.out.println("1. 로그인 | 2. 종료");
			System.out.print("메뉴 선택> ");

			menu = Integer.parseInt(sc.nextLine());
		} else {
			System.out.println("1. 학생 등록 | 2. 성적 입력 | 3. 학생 정보 수정 | 4. 학생 정보 조회 | 5. 로그아웃");
			System.out.print("메뉴 선택> ");
			menu = Integer.parseInt(sc.nextLine());
		}
	}
}

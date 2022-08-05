package pshProf.lesson0804.member;

import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);

	public Application() {
		run();
		// 실행 하는 곳
		// MemberManangement mm = new MemberManangement();
		// mm.getMemberList();

	}

	private void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 전체 조회 | 2. 단건 조회 | 3. 회원 입력");
			System.out.println("-------------------------------------");
			System.out.println("4. 회원 수정 | 5. 회원 삭제 | 6. 종료");

			System.out.print("메뉴 선택> ");

			int menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				List<Member> list = MemberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("회원정보가 1도 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}
				}
				break;
			case 2:
				System.out.print("조회할 회원의 id를 입력하세요.> ");
				String id = sc.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);

				if (member == null) {
					System.out.println("등록되지 않은 ID입니다.");
				} else {
					System.out.println(member.toString());
				}
				break;
			case 3:
				Member insertMember = new Member();
				System.out.println("====== 회원 등록 ======");
				System.out.print("ID 입력> ");
				String insertId = sc.nextLine();
				insertMember.setId(insertId);

				System.out.print("PW 입력> ");
				String insertPw = sc.nextLine();
				insertMember.setPw(insertPw);

				System.out.print("이름 입력> ");
				String insertName = sc.nextLine();
				insertMember.setName(insertName);

				int insertResult = MemberManagement.getInstance().insertMember(insertMember);
				if (insertResult == 1) {
					System.out.println("정상 입력");
				} else {
					System.out.println("입력 실패");
				}
				break;
			case 4:
				Member updateMember = new Member();
				System.out.println("====== 회원 수정 ======");

				System.out.print("수정할 ID> ");
				String updateId = sc.nextLine();
				updateMember.setId(updateId);

				System.out.print("수정할 PW> ");
				String updatePw = sc.nextLine();
				updateMember.setPw(updatePw);

				int updateResult = MemberManagement.getInstance().updateMember(updateMember);
				if (updateResult == 1) {
					System.out.println("정상 수정");
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.println("====== 회원 삭제 ======");

				System.out.print("삭제할 ID> ");
				String deleteId = sc.nextLine();

				int deleteResult = MemberManagement.getInstance().deleteMember(deleteId);
				if (deleteResult == 1) {
					System.out.println("정상 삭제");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		}
	}
}

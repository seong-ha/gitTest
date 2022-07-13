package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	Scanner sc = new Scanner(System.in);

	public void execute() {

		boolean run = true;
		while (run) {
			// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
			System.out.println("1. 등록 | 2. 수정 | 3. 전체리스트 | 9. 종료");
			System.out.print("메뉴를 선택하세요> ");

			int selectNo = Integer.parseInt(sc.nextLine());
			// 1)도서반=>기본정보+도서반장,강의실이름
			// 축구반=>기본정보+코치이름,락커룸이름
			// 수영반=>기본정보+강사이름,수영등급

			if (selectNo == 1) {

//				회원아이디, 회원명, 연락처 정보.
				System.out.print("아이디를 입력하세요. > ");
				int memberId = Integer.parseInt(sc.nextLine());

				System.out.print("회원명을 입력하세요. > ");
				String memberName = sc.nextLine();

				System.out.print("연락처를 입력하세요. > ");
				String phone = sc.nextLine();

				System.out.println("1. 독서반 | 2. 수영반 | 3. 축구반");
				System.out.print("선택할 반의 \"번호\"를 선택하세요.( 1 | 2 | 3 ) > ");
				int choiceBan = Integer.parseInt(sc.nextLine());

				if (choiceBan == 1) {
					System.out.print("도서반장 이름을 입력하세요. > ");
					String headOfBookBanName = sc.nextLine();

					System.out.print("강의실 이름을 입력하세요. > ");
					String bookBanName = sc.nextLine();

					Member bookMember = new BookMember(memberId, memberName, phone, headOfBookBanName, bookBanName);

					addMember(bookMember);
				} else if (choiceBan == 2) {
					System.out.print("수영강사이름 이름을 입력하세요. > ");
					String swimTName = sc.nextLine();

					System.out.print("수영강사 등급을 입력하세요. > ");
					String swimTRank = sc.nextLine();

					Member swimMember = new SwimMember(memberId, memberName, phone, swimTName, swimTRank);

					addMember(swimMember);
				} else if (choiceBan == 3) {
					System.out.print("축구코치이름 이름을 입력하세요. > ");
					String soccerCoachName = sc.nextLine();

					System.out.print("락커룸 이름을 입력하세요. > ");
					String soccerLockerName = sc.nextLine();

					Member soccerMember = new SoccerMember(memberId, memberName, phone, soccerCoachName,
							soccerLockerName);

					addMember(soccerMember);
				}

			} else if (selectNo == 2) {
				System.out.println("수정할 아이디를 입력하세요. > ");
				int memberId = Integer.parseInt(sc.nextLine());
				boolean isIn = false;

				for (Member oneMember : members) {
					if (oneMember.getMemberId() == memberId) {
						modifyMember(oneMember);
						isIn = true;
					}
				}

				if (!isIn) {
					System.out.println("해당하는 멤버가 없습니다.");
				}
			} else if (selectNo == 3) {
				List<Member> list = memberList();
				for (Member member : list) {
					System.out.println(member.toString());
				}
			} else if (selectNo == 9) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
		}

	}

	@Override
	public void addMember(Member member) {
		members.add(member);
		System.out.println("등록이 완료되었습니다.");
	}

	@Override
	public void modifyMember(Member member) {

		System.out.println("기존 연락처: " + member.getPhone());
		System.out.print("수정할 연락처를 입력하세요.");
		String changePhone = sc.nextLine();
		member.setPhone(changePhone);

		System.out.println("수정이 완료되었습니다.");
	}

	@Override
	public List<Member> memberList() {
		return members;
	}
}

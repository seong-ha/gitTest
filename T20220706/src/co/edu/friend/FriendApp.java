package co.edu.friend;

import java.util.Scanner;

public class FriendApp {
	Scanner sc = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	int friendNum = 0;

	public void start() {

		while (true) {
			System.out.println();
			System.out.println("1. 등록 2. 조회 3. 목록 9. 종료");
//			timerShow("1.등록 2.조회 3.목록 9.종료");
			System.out.print("선택> ");

			int selectNo = 0;

			try {
				selectNo = Integer.parseInt(sc.nextLine().trim());
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}

			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	private void add() {
		int count = 0;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				count++;
			}

			if (count >= friends.length) {
				System.out.println("친구목록이 다 찼습니다.");
				return;
			}
		}

		int friendKind = 0;

		while (true) {
			System.out.println("1. 학교친구 2. 회사친구 3. 친구");
			System.out.print("친구 종류 선택> ");

			try {
				friendKind = Integer.parseInt(sc.nextLine().trim());
				if (!(friendKind == 1 || friendKind == 2 || friendKind == 3)) {
					System.out.println("1, 2, 3번 중에 선택하세요.");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("1, 2, 3번 중에 선택하세요.");
			}
		}

		System.out.print("이름> ");
		String name = sc.nextLine();

		System.out.print("연락처> ");
		String tel = sc.nextLine();

		if (friendKind == 1) {
			System.out.print("대학교> ");
			String univ = sc.nextLine();
			System.out.print("전공> ");
			String major = sc.nextLine();

			friends[friendNum++] = new UnivFriend(name, tel, univ, major);
		} else if (friendKind == 2) {
			System.out.print("회사> ");
			String company = sc.nextLine();
			System.out.print("부서> ");
			String department = sc.nextLine();
			friends[friendNum++] = new CompanyFriend(name, tel, company, department);
		} else if (friendKind == 3) {
			friends[friendNum++] = new Friend(name, tel);
		}

		System.out.println("등록 완료");
	}

	private void search() {
		System.out.print("찾을 친구의 이름> ");
		String name = sc.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].showInfo();
				System.out.println("\n조회 완료");
				return;
			} else if (friends[i] == null) {

			}
		}
		System.out.println("찾으시는 친구가 없습니다.");
	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
		System.out.println("전체 조회 완료");
	}

	private void timerShow(String msg) {
		String[] message = msg.split("");
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

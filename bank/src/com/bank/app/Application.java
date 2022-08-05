package com.bank.app;

import java.util.Scanner;

import com.bank.member.MemberService;

public class Application {
	
	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	public Application() {
		run();
	}

	private void run() {
		System.out.println("1. 로그인 | 2. 종료");
		System.out.print("메뉴 선택> ");
		
		int menuNo = Integer.parseInt(sc.nextLine());
		
		switch (menuNo) {
		case 1: // 로그인 하는 기능
			ms.doLogin();
			if (MemberService.memberInfo != null) {
				new Management();
			}
			break;
		case 2:
			break;
		}
	}
}

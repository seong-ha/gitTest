package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.member.MemberService;

public class Management {
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	Scanner sc = new Scanner(System.in);
	int menuNo = 0;

	public Management() {
		bankJob();
	}

	private void bankJob() {
		while (true) {
			menuInfo(); // while문 안으로 넣어야 처음 선택한 menuNo 무한 반복를 해결할 수 있음.
			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menuNo == 1) { // 고객 등록
					ms.registerCustomer();
				} else if (menuNo == 2) { // 계좌 개설
					as.makeAccount();
				} else if (menuNo == 3) { // 입출금
					as.money();
				} else if (menuNo == 4) { // 계좌 이체
					as.transfer();
				} else if (menuNo == 5) { // 계좌 해지
					as.deleteAccount();
				} else if (menuNo == 6) { // 대출

				}
			} else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) { // 계좌 조회

				} else if (menuNo == 2) { // 입금

				} else if (menuNo == 3) { // 출금

				} else if (menuNo == 4) { // 계좌 이체

				} else if (menuNo == 5) { // 대출

				}
			}
		}
	}

	private void menuInfo() {
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입출금 | 4. 계좌 이체 | 5. 계좌 해지 | 6. 대출");
		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2. 입금 | 3. 출금 | 4. 계좌 이체 | 5. 대출");
		}
		System.out.print("메뉴 선택> ");
		menuNo = Integer.parseInt(sc.nextLine());
	}
}

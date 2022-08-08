package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class Management {

	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();

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
					System.out.println("1. 대출 승인 | 2. 대출 정보(상태) 변경");
					int menu = Integer.parseInt(sc.nextLine());
					
					if (menu == 1) {
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
				} else if (menuNo == 7) {
					ms.logout();
					return;
				}
			} else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) { // 계좌 조회
					as.getAccount();
				} else if (menuNo == 2) { // 입출금
					as.money();
				} else if (menuNo == 3) { // 계좌 이체
					as.transfer();
				} else if (menuNo == 4) { // 대출
					System.out.println("1. 대출 상환 | 2. 대출 정보 조회");
					int menu = Integer.parseInt(sc.nextLine());
					
					if (menu == 1) {
						ls.updateMoney();
					} else if (menu == 2) {
						ls.getLoanInfo();
					}
				}
			}
		}
	}

	private void menuInfo() {
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입출금 | 4. 계좌 이체 | 5. 계좌 해지 | 6. 대출 | 7. 로그아웃");
		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2. 입출금 | 3. 계좌 이체 | 4. 대출");
		}
		System.out.print("메뉴 선택> ");
		menuNo = Integer.parseInt(sc.nextLine());
	}
}

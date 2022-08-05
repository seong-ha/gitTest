package com.bank.account;

import java.util.Scanner;

public class AccountService {
	/*
	 * 1. 계좌 계설 2. 입금 3. 출금 4. 계좌 해지 5. 계좌 이체
	 */

	Scanner sc = new Scanner(System.in);

	public void makeAccount() {
		Account account = new Account();
		System.out.println("계좌 번호 입력>");
		String accountId = sc.nextLine();

		System.out.println("회원 ID 입력>");
		String memberId = sc.nextLine();

		account.setAccountId(accountId);
		account.setMemberId(memberId);

	}

	// 2. 입출금
	public void money() {
		Account account = new Account();
		System.out.println("1. 입금 | 2. 출금");
		System.out.print("메뉴 선택> ");
		int cmd = Integer.parseInt(sc.nextLine());
		System.out.print("계좌번호 입력> ");
		String accountId = sc.nextLine();

		if (cmd == 1) { // 입금
			System.out.println("입금할 금액 입력>");
		} else if (cmd == 2) { // 출금
			System.out.println("입금할 금액 입력>");
		}
		int money = Integer.parseInt(sc.nextLine());
		account.setAccountId(accountId);
		account.setBalance(money);

		int result = AccountManage.getInstance().updateMoney(account, cmd);

		if (result == 1 && cmd == 1) {
			System.out.println("입금 완료");
		} else if (result == 1 && cmd == 2) {
			System.out.println("출금 완료");
		}
	}

	// 3. 계좌 해지
	public void deleteAccount() {
		System.out.println("======== 계좌 해지 ========");
		System.out.print("해지할 계좌 입력> ");
		String accountId = sc.nextLine();

		int result = AccountManage.getInstance().delAccount(accountId);

		if (result == 1) {
			System.out.println("정상 해지");
		} else {
			System.out.println("해당하는 계좌가 없습니다.");
		}
	}

	// 4. 계좌 이체
	public void transfer() {
		
		/*
		계좌 이체에 필요한 정보
		1. 받는 사람 계좌
		2. 보내는 사람 계좌
		3. 보내는 사람의 비밀번호 확인(join) 또는 select 계좌와 비밀번호가 맞는지
		  => 데이터 유효성 검사.
		4. 출금 금액
		 */
		
		System.out.println("======== 계좌 이체 ========");
		
		System.out.println("보내는 사람 계좌");
		String fromAccountId = sc.nextLine();
		
		System.out.println("받는 사람 계좌");
		String toAccountId = sc.nextLine();
		
		System.out.println("출금 금액");
		int money = Integer.parseInt(sc.nextLine());
		
		AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, money);
	}
}

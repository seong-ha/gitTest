package com.bank.account;

import java.util.List;
import java.util.Scanner;

import com.bank.member.MemberService;

public class AccountService {
	/*
	 * 1. 계좌 개설 2. 입금 3. 출금 4. 계좌 해지 5. 계좌 이체
	 */

	Scanner sc = new Scanner(System.in);

	public void makeAccount() {
		Account account = new Account();
		System.out.println("계좌 번호 입력>");
		String accountId = sc.nextLine();

		System.out.println("회원 ID 입력>");
		String customId = sc.nextLine();

		account.setAccountId(accountId);
		account.setMemberId(customId);
		
		// 계좌 등록 마무리(8월 5일 9시 56분) - 8월 8일 수업에 추가하심.
		int result = AccountManage.getInstance().insertAccount(account);
		
		if (result == 1) {
			System.out.println("계좌 개설 완료");
		} else {
			System.out.println("계좌 개설 실패");
		}

	}

	// 2. 입출금
	public void money() {
		Account account = new Account();
		System.out.println("1. 입금 | 2. 출금");
		System.out.print("메뉴 선택> ");
		int cmd = Integer.parseInt(sc.nextLine());
		System.out.print("입출금할 계좌번호 입력> ");
		String accountId = sc.nextLine();

		if (cmd == 1) { // 입금
			System.out.println("입금할 금액 입력>");
		} else if (cmd == 2) { // 출금
			System.out.println("출금할 금액 입력>");
		}
		int money = Integer.parseInt(sc.nextLine());
		account.setAccountId(accountId);
		account.setBalance(money);

		int result = AccountManage.getInstance().updateMoney(account, cmd);

		// 입출금 결과에 대한 상세한 안내를 하도록 수정(8월 5일 10시 10분)
		if (result == 1) {
			if (cmd == 1) {
				System.out.println("입금 완료");
			} else if (cmd == 2) {
				System.out.println("출금 완료");
			}
		} else if (result != 1) {
			if (cmd == 1) {
				System.out.println("입금 실패");
			} else if (cmd == 2) {
				System.out.println("출금 실패");
			}
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
		
		System.out.println("보내는 사람 계좌(출금될 계좌)");
		String fromAccountId = sc.nextLine();
		
		System.out.println("받는 사람 계좌(입금될 계좌)");
		String toAccountId = sc.nextLine();
		
		System.out.println("출금 금액");
		int money = Integer.parseInt(sc.nextLine());
		
		AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, money);
	}
	
	// 계좌조회
	public void getAccount() {
		List<Account> list = AccountManage.getInstance().getAccountList(MemberService.memberInfo.getMemberId());
		System.out.println(MemberService.memberInfo.getMemberName() + " 님의 계좌정보");
		
		for (Account account : list) {
			System.out.println("계좌 ID: " + account.getAccountId());
			System.out.println("잔고: " + account.getBalance());
			System.out.println("생성일: " + account.getCredate());
		}
	}
}

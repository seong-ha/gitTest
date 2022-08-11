package com.bank.account;

import java.sql.Date;
/*
java.util.Date - 년/월/일/시/분/초 - 처리하는 방법이 좀 까다롭긴 함.
java.sql.Date - 년/월/일
 */

import lombok.Data;

public class Account {
	private String accountId;
	private String memberId;
	private int balance;
	private Date credate;
	public String getAccountId() {
		return accountId;
	}
	public String getMemberId() {
		return memberId;
	}
	public int getBalance() {
		return balance;
	}
	public Date getCredate() {
		return credate;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
	
}

package com.bank.member;

public class Member {
	private String memberId; // 회원 id
	private String memberPw; // 회원 비밀번호
	private String memberName; // 회원 이름
	private String accountId; // 계좌번호
	private String role; // 권한 (1: 은행원, 0: 사용자)

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getRole() {
		return role;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + ", accountId="
				+ accountId + ", role=" + role + "]";
	}

	
}

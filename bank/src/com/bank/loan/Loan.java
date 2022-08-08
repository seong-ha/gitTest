package com.bank.loan;

public class Loan {
	private String loanId;
	private String memberId;
	private String loanDate;
	private String state;
	private int loanMoney;
	private String memberName;

	public String getLoanId() {
		return loanId;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public String getState() {
		return state;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getLoanMoney() {
		return loanMoney;
	}

	public void setLoanMoney(int loanMoney) {
		this.loanMoney = loanMoney;
	}

	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", memberId=" + memberId + ", loanDate=" + loanDate + ", state=" + state
				+ "]";
	}

}

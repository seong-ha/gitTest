package com.bank.loan;

import java.sql.Date;

public class Loan {
	private String loanId;
	private String memberid;
	private Date loandate;
	private String state;

	public String getLoanId() {
		return loanId;
	}

	public String getMemberid() {
		return memberid;
	}

	public Date getLoandate() {
		return loandate;
	}

	public String getState() {
		return state;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public void setLoandate(Date loandate) {
		this.loandate = loandate;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", memberid=" + memberid + ", loandate=" + loandate + ", state=" + state
				+ "]";
	}

}

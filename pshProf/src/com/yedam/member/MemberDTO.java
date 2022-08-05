package com.yedam.member;

public class MemberDTO {
	private String memberId; // member_id..회원 아이디
	private String memberPw; // member_pw..회원 패스워드
	private String memberName; // member_name.. 회원 이름
	private String memberBelong; // member_belong.. 회원 소속

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberBelong() {
		return memberBelong;
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

	public void setMemberBelong(String memberBelong) {
		this.memberBelong = memberBelong;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberBelong=" + memberBelong + "]";
	}

}

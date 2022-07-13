package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	private String soccerCoachName;
	// 락커룸의 이름.(A, B, C, D)
	private String soccerLockerName;

	public SoccerMember() {
	}

	public SoccerMember(int memberId, String memberName, String phone, String soccerCoachName,
			String soccerLockerName) {
		super(memberId, memberName, phone);
		this.soccerCoachName = soccerCoachName;
		this.soccerLockerName = soccerLockerName;
	}

	public String getSoccerCoachName() {
		return soccerCoachName;
	}

	public void setSoccerCoachName(String soccerCoachName) {
		this.soccerCoachName = soccerCoachName;
	}

	public String getSoccerLockerName() {
		return soccerLockerName;
	}

	public void setSoccerLockerName(String soccerLockerName) {
		this.soccerLockerName = soccerLockerName;
	}

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A
	@Override
	public String toString() {
		return "SoccerMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone="
				+ super.getPhone() + ", soccerCoachName=" + soccerCoachName + ", soccerLockerName=" + soccerLockerName
				+ "]";
	}

}

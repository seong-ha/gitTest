package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	private String swimTName;
	// 수영등급(A,B,C,D)
	private String swimTRank;

	public SwimMember() {
	}

	public SwimMember(int memberId, String memberName, String phone, String swimTName, String swimTRank) {
		super(memberId, memberName, phone);
		this.swimTName = swimTName;
		this.swimTRank = swimTRank;
	}

	public String getSwimTName() {
		return swimTName;
	}

	public void setSwimTName(String swimTName) {
		this.swimTName = swimTName;
	}

	public String getSwimTRank() {
		return swimTRank;
	}

	public void setSwimTRank(String swimTRank) {
		this.swimTRank = swimTRank;
	}

	// 정보출력시 => 강사이름: 홍길동, 등급: A
	@Override
	public String toString() {
		return "SwimMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone="
				+ super.getPhone() + ", swimTName=" + swimTName + ", swimTRank=" + swimTRank + "]";
	}

}

package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	private String headOfBookBanName;
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String bookBanName;

	public BookMember() {
	}

	public BookMember(int memberId, String memberName, String phone, String headOfBookBanName, String bookBanName) {
		super(memberId, memberName, phone);
		this.headOfBookBanName = headOfBookBanName;
		this.bookBanName = bookBanName;
	}

	public String getHeadOfBookBanName() {
		return headOfBookBanName;
	}

	public void setHeadOfBookBanName(String headOfBookBanName) {
		this.headOfBookBanName = headOfBookBanName;
	}

	public String getBookBanName() {
		return bookBanName;
	}

	public void setBookBanName(String bookBanName) {
		this.bookBanName = bookBanName;
	}

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
	@Override
	public String toString() {
		return "BookMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone="
				+ super.getPhone() + ", headOfBanName=" + headOfBookBanName + ", bookBanName=" + bookBanName + "]";
	}

}

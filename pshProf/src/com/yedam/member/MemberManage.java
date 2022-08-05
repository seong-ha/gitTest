package com.yedam.member;

import com.yedam.common.DAO;

// member 관련 sql(DB)를 다 작성
public class MemberManage extends DAO {

	// 싱글톤
	private static MemberManage mm = null;

	// 생성자 막기
	private MemberManage() {

	}

	public static MemberManage getInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}

		return mm;
	}

	// 로그인
	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;

		try {
			conn();
			// 쿼리문으로 로그인 조회해보는 경우 -> ★developer에서 쿼리 실행해서 확인해보기!
			String sql = "select * from member where member_id = ? and member_pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberBelong(rs.getString("member_belong"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return mem;
	}
}
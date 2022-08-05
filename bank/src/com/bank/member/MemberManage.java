package com.bank.member;

import com.bank.common.DAO;

public class MemberManage extends DAO {
	// 싱글톤
	private static MemberManage mm = new MemberManage();

	// 생성자 막기
	private MemberManage() {

	}

	public static MemberManage getInstance() {
		return mm;
	}
	
	public Member loginInfo (String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from bankmember where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("탔음.");
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return member;
	}
	
	// 고객 등록
	public int registCustomer(Member member) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into bankmember (member_id, member_pw, member_name, member_role)"
					+ " values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
}

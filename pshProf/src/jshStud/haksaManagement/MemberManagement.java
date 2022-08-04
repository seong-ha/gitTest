package jshStud.haksaManagement;

import jshStud.common.DAO;

public class MemberManagement extends DAO{
	private static MemberManagement mm = null;
	
	private MemberManagement() {
		
	}
	
	public static MemberManagement getInstance() {
		if (mm == null) {
			mm = new MemberManagement();
			return mm;
		} else {
			return mm;
		}
	}
	
	public Member findMember(String id, String pw) {
		Member member = null;
		try {
			conn();
			String sql = "select member_id, member_pw from member "
					+ "where member_id = ? and member_pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new Member();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				System.out.println("OK");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return member;
	}
}

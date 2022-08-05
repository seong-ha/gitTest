package pshProf.lesson0804.member;

import java.util.ArrayList;
import java.util.List;

import pshProf.lesson0804.common.DAO;

public class MemberManagement extends DAO {
	private static MemberManagement mm = null;
	
	private MemberManagement() {}
	
	public static MemberManagement getInstance() {
		if (mm == null) {
			return new MemberManagement();
		} else {
			return mm;
		}
	}
	
	// 1. 전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		
		try {
			conn(); // 1. DB 연결
			String sql = "select * from member"; // 2. query 작성
			stmt = conn.createStatement(); // 3. DB 연결 후 조회할 수 있는 창구 생성
			rs = stmt.executeQuery(sql); // 4. 창구를 통해서 sql 실행.
			
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}
	
	// 2. 단건 조회
	public Member getMember(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			// 매개변수를 통한 데이터 조회
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return member;
	}
	
	// 3. 입력.
	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 4. 수정
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  member.getPw());
			pstmt.setString(2,  member.getId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 5. 삭제
	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
}

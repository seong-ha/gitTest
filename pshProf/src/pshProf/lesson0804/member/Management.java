package pshProf.lesson0804.member;

import java.util.ArrayList;
import java.util.List;

import pshProf.lesson0804.common.DAO;

public class Management extends DAO {

	public Management() {
		// 전체 조회
//		showInfo();
		// 1건 조회
//		getMember();
		// 1건 입력
//		insertInfo();
		// 수정
//		updateInfo();
		// 삭제
		deleteInfo();
	}

	private void deleteInfo() {
		int result = 0;
		try {
			conn(); // 1. DB 연결.
			String sql = "delete member where id = ?"; // 2. Query문 작성.
			pstmt = conn.prepareStatement(sql); // 2. 창구 및 query 생성
			pstmt.setString(1, "A"); // 첫번째 물음표에는 A를 넣어라.
			result = pstmt.executeUpdate(); // DML(insert,update,delete) -> executeUpdate()
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		if (result == 1) {
			System.out.println(result + "건이 삭제되었습니다.");
		} else {
			System.out.println("삭제 되지 않았습니다.");
		}
	}

	private void updateInfo() {
		int result = 0;
		try {
			conn(); // 1. DB 연결.
			String sql = "update member set pw = ? where id = ?"; // 2. Query문 작성.
			pstmt = conn.prepareStatement(sql); // 2. 창구 및 query 생성
			pstmt.setString(1, "4321"); // 첫번째 물음표에는 A를 넣어라.
			pstmt.setString(2, "A"); // 두번째 물음표에는 A를 넣어라.

			result = pstmt.executeUpdate(); // DML(insert,update,delete) -> executeUpdate()
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		if (result == 1) {
			System.out.println(result + "건이 수정되었습니다.");
		} else {
			System.out.println("수정 되지 않았습니다.");
		}
	}

	private void insertInfo() {
		int result = 0;
		try {
			conn(); // 1. DB 연결.
			String sql = "insert into member values (?,?,?)"; // 2. Query문 작성.
			pstmt = conn.prepareStatement(sql); // 3. 데이터를 받는 동시에 보내버림.
			pstmt.setString(1, "G"); // 첫번째 물음표에는 A를 넣어라.
			pstmt.setString(2, "1234"); // 두번째 물음표에는 A를 넣어라.
			pstmt.setString(3, "yd"); // 세번째 물음표에는 A를 넣어라.

			result = pstmt.executeUpdate(); // DML(insert,update,delete) -> executeUpdate()
			// Select -> executeQuery()

			if (result == 1) {
				System.out.println(result + "건이 정상 입력 되었습니다.");
			} else {
				System.out.println("입력 되지 않았습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	private void getMember() {
		Member member = null;

		try {
			conn(); // 1. DB 연결.
			String sql = "select * from member where id = ?"; // 2. Query문 작성.
			pstmt = conn.prepareStatement(sql); // 3. 데이터를 받는 동시에 보내버림.
			pstmt.setString(1, "A"); // 첫번째 물음표에는 A를 넣어라.
			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getNString("pw"));
				member.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		System.out.println("---------------------------------");
		System.out.println(member.toString());
	}

	// 전체조회(여러 Member)
	private void showInfo() {
		List<Member> list = new ArrayList<>();
		Member mem = null;

		try {
			conn(); // 1. conn메서드로 DB 연결.
			String sql = "select * from member"; // 2. Query문 작성.
			stmt = conn.createStatement(); // 3. 연결된 DB에 query문 보낼 수 있는 창구 생성.
			rs = stmt.executeQuery(sql); // 4. 3번에서 만든 창구로 query문을 보냄. ResultSet(rs)는 select 조회할 때만 사용

			while (rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setPw(rs.getNString("pw"));
				mem.setName(rs.getString("name"));
				list.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		for (Member member : list) {
			System.out.println(member.toString());
		}
	}
}

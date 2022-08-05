package pshProf.lesson0804.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// Data Access Object

public class DAO {
	// java <-> DB 연결할 때 쓰는 객체
	protected Connection conn = null;
	// Select(조회) 결과 값 반환 받는 객체
	protected ResultSet rs = null;
	// Query문 담고 Query문 실행하는 객체
	protected PreparedStatement pstmt = null; // dml때 좋고
	protected Statement stmt = null; // 두개 차이 있음. // select는 이게 좋음.

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "test";
	String pw = "1234";

	public void conn() {
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			// 2. DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

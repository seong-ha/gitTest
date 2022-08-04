package jshStud.haksaManagement;

import jshStud.common.DAO;

public class StudentManagement extends DAO {
	private static StudentManagement sm = null;

	private StudentManagement() {

	}

	public static StudentManagement getInstance() {
		if (sm == null) {
			sm = new StudentManagement();
			return sm;
		} else {
			return sm;
		}
	}

	public int insertStudent(Student student) {
		int result = 0;
		try {
			conn();
			String sql = "insert into student ("
					+ "student_id, student_name, student_class, student_addr, student_phone)"
					+ " values (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudent_id());
			pstmt.setString(2, student.getStudent_name());
			pstmt.setString(3, student.getStudent_class());
			pstmt.setString(4, student.getStudent_addr());
			pstmt.setString(5, student.getStudent_phone());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	public int insertScore(int kor, int eng, int math) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into student (student_kor, student eng, student_math) "
					+ "values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, kor);
			pstmt.setInt(2, eng);
			pstmt.setInt(3, math);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	public int updateStudent(String name, String addr, String phone) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into student (student_name, student_addr, student_phone) "
					+ "values (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, phone);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
}

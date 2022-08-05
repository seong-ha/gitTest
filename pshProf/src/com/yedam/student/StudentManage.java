package com.yedam.student;

import com.yedam.common.DAO;

public class StudentManage extends DAO{
	private static StudentManage sm = new StudentManage();
	
	private StudentManage() {
		
	}
	
	public static StudentManage getInstance() {
		return sm;
	}

	// 학생 입력
	public int insertStudent(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into student (student_id, student_name, student_class, student_addr, student_phone)"
					+ " values (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentPhone());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 국어 성적 입력
	public int insertKor(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "update student set student_kor = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 영어 성적 입력
	public int insertEng(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "update student set student_eng = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 수학 성적 입력
	public int insertMath(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "update student set student_math = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	// 학생 정보변경
		// 전화 번호 입력
	public int updatePhone(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "update student set student_phone = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentPhone());
			pstmt.setInt(1, std.getStudentId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return result;
	}
	
	public StudentDTO getStudentDTO(int id) {
		StudentDTO std = null;
		
		try {
			conn();
			String sql = "select * from student where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentPhone(rs.getString("student_phone"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_class"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return std;
	}
}

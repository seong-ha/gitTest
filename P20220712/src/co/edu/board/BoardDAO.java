package co.edu.board;

import java.util.ArrayList;
import java.util.List;

// 목록 등록 조회(작성자) 삭제
public class BoardDAO {
	// 싱글톤.

	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<Board>();
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 1. 목록
	public List<Board> boardList() {
		return list;
	}

	// 2. 등록
	public void add(Board board) {
		list.add(board);
		System.out.println("등록이 완료되었습니다.");
	}

	// 3. 조회(작성자)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>();
		boolean isIn = false;
		for (Board board : this.list) {
			if (board.getWriter().equals(writer)) {
				isIn = true;
				list.add(board);
				System.out.println("해당 작성자가 조회되었습니다.");
			}
		}

		if (!isIn) {
			System.out.println("해당하는 작성자가 없습니다.");
		}
		return list;
	}

	// 4. 삭제(제목)
	public void remove(String title) {
		for (Board board : this.list) {
			if (board.getTitle().equals(title)) {
				list.remove(board);
				System.out.println("삭제가 완료되었습니다.");
				break;
			} else {
				System.out.println("해당 글이 없습니다.");
			}
		}
	}
}
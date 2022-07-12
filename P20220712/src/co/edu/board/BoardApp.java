package co.edu.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		BoardDAO boardDAO = BoardDAO.getInstance();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 목록 | 2. 등록 | 3. 조회 | 4. 삭제 | 5. 종료");
			System.out.print("메뉴를 선택하세요.> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				List<Board> list = boardDAO.boardList();
				int count = 0;
				System.out.println("============ 글 목 록 ============\n");
				System.out.printf("%10s%10s%10s\n", "글 제목", "글 작성자", "글 내용");
				for (Board board : list) {
					System.out.printf("%s%9s%12s%12s\n", ++count + ".", board.getTitle(), board.getWriter(),
							board.getContent());
				}
			} else if (selectNo == 2) {
				System.out.print("글 제목을 입력하세요.> ");
				String title = sc.nextLine();

				System.out.print("글 작성자를 입력하세요.> ");
				String writer = sc.nextLine();

				System.out.print("글 내용을 입력하세요.> ");
				String content = sc.nextLine();

				Board board = new Board(title, writer, content);
				boardDAO.add(board);
			} else if (selectNo == 3) {
				System.out.print("조회할 글 작성자를 입력하세요.> ");
				String writer = sc.nextLine();
				List<Board> list = boardDAO.search(writer);

				System.out.println("============ 조회한 글 ============\n");

				for (Board board : list) {
					System.out.println("글 제목: " + board.getTitle());
					System.out.println("글 작성자: " + board.getWriter());
					System.out.println("글 내용: " + board.getContent());
					System.out.println();
				}
				System.out.println("조회가 완료되었습니다.");
			} else if (selectNo == 4) {
				System.out.print("삭제할 글 제목을 입력하세요.> ");
				String title = sc.nextLine();
				boardDAO.remove(title);
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("1~5번 메뉴 중에서만 선택해주세요.");
				continue;
			}
		}

	}

}

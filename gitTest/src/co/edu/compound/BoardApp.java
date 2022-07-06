package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 리스트 | 6. 종료");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
		
			if(selectNo == 1) {
				System.out.println("글 제목을 입력하세요> ");
				String title = sc.nextLine();
				System.out.println("글 내용을 입력하세요> ");
				String content = sc.nextLine();
				System.out.println("글 작성자를 입력하세요> ");
				String writer = sc.nextLine();
				
				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);
				
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						boards[i] = board;
						break;
					}
				}
				System.out.println("정상적으로 등록되었습니다.");
				
			} else if (selectNo == 2) {
				System.out.println("조회할 글제목을 입력하세요.> ");
				String findTitle = sc.nextLine();
				
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.printf("제목: %s, 내용: %s, 작성자: %s, 작성일시: %s, 조회수: %d\n\n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(),
								boards[i].getCreateDate(), boards[i].getHitCount());
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
					}
				}

			} else if (selectNo == 3) {
				System.out.println("수정할 글제목을 입력하세요.> ");
				String findTitle = sc.nextLine();
				
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("이전 내용: " + boards[i].getContent());
						System.out.println("수정할 내용을 입력하세요> ");
						String content = sc.nextLine();
						boards[i].setContent(content);
						
						System.out.println("정상적으로 수정되었습니다.");
						break;
					}
				}
				
			} else if (selectNo == 4) {
				System.out.println("삭제할 글제목을 입력하세요.> ");
				String findTitle = sc.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						boards[i] = null;
						break;
					} else if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
						System.out.println("해당 글이 없습니다.");
					}
				}
				
			} else if (selectNo == 5) {
				System.out.println("============ 글 목 록 ============");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목: %s, 내용: %s, 작성자: %s, 작성일시: %s, 조회수: %d\n\n",
								boards[i].getTitle(), boards[i].getContent(), boards[i].getWriter(),
								boards[i].getCreateDate(), boards[i].getHitCount());
					}
				}
			} else if (selectNo == 6) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
		}
	}
}
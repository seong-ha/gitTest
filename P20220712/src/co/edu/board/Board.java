package co.edu.board;
// 데이터 담아주는 용도
// 데이터의 입출력을 담당.
// main메서드를담고 있는 클래스. <1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료
// 예전부터 히스토리를 보면 변수저장 -> 배열저장 -> 배열(클래스) 저장 -> 컬렉션(클래스)저장. 내일은 파일시스템저장 -> DBMS저장
public class Board {
	
	private String title;
	private String writer;
	private String content;
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

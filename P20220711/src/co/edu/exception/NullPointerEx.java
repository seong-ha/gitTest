package co.edu.exception;

public class NullPointerEx {

	public static void main(String[] args) {

		String name = "홍길동";
		name = null;

		try {
			System.out.println(name.toString());
			System.out.println("name을 출력합니다.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("프로그램 종료.");
	}

}

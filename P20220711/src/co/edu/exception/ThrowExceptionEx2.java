package co.edu.exception;

public class ThrowExceptionEx2 {

	public static void main(String[] args) {

		String[] str = { "100", "200", "200", "400" };

		try {
			subMethod(str);
		} catch (NumberFormatException e) {
			System.out.println("예외 종류: NumberFormat 예외");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 종류: 배열의 범위 초과 예외");
		} catch (Exception e) {
			System.out.println("그 외 종류: 알 수 없는 예외");
		} finally {
			System.out.println("프로그램의 정상 종료");
		}

		System.out.println("프로그램 종료.");
	}

	public static void subMethod(String[] strArr)
			throws NumberFormatException, ArrayIndexOutOfBoundsException {
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(strArr[i]);
			System.out.println(num);
		}
	}

}

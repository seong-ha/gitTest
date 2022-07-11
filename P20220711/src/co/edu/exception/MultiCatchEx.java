package co.edu.exception;

import java.util.Scanner;

public class MultiCatchEx {

	public static void main(String[] args) {

		int[] intArr = new int[2];
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력: ");
		try {
			intArr[0] = (int) (Math.random() * 100) + 1;
			intArr[1] = (int) (Math.random() * 100) + 1;

			intArr[2] = Integer.parseInt(sc.nextLine());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외.");
		}

		System.out.println("프로그램 종료.");
	}

}

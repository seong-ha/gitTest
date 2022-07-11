package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		try {
			System.out.print("숫자를 입력하세요.");
			int input = sc.nextInt();
			System.out.println("입력값: " + input);
		} catch (InputMismatchException e) {
			System.out.println("잘못된 값 입력됨.");
		}

		System.out.println("프로그램 종료");
	}

}
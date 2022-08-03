package string;

import java.util.Scanner;

public class StringSubstring {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		age();
	}

	public static void age() {
		// TODO Auto-generated method stub
		
		String num = sc.nextLine();
		String yearStr = num.substring(0, 2);
		int yearInt = 0;

		if (num.indexOf(0) == 0) {
			yearInt = num.indexOf(1);
		} else {
			yearInt = Integer.parseInt(yearStr);
		}
		
		int age;
		if (23 <= yearInt && yearInt <= 99) {
			age = 100 - yearInt + 22 + 1;
		} else {
			age = 22 - yearInt + 1;
		}
		
		System.out.println("나이 결과");
		System.out.println("입력한 생년월일: " + num.substring(0, 6) + " 나이: " + age);
	}

}

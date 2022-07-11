package co.edu;

import java.util.Scanner;

public class MorningEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플" };
		
		System.out.print("과일을 입력하세요.> ");
		String fruit = sc.nextLine();
		boolean isExist = false;
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(fruit)) {
				System.out.println((i + 1) + "번째에 있습니다.");
				isExist = true;
				break;
			}
		}
		
		if (!isExist)
			System.out.println("찾는 과일이 없습니다.");
	}

}
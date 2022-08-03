package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAPI3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menuNo = 0;
		List<String> list = new ArrayList<>();

		while (menuNo != 99) {
			System.out.println("기능을 선택해주세요.");
			System.out.println("1. 단어 입력, 2. 대,소문자 변환 " + "3. 단어길이 4. 단어자르기 5. 단어자르기2 99. 프로그램 종료");
			System.out.println("입력> ");
			menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					String word = sc.nextLine();
					if (word.equals("q")) {
						break;
					}
					list.add(word);
				}
				for (String str : list) {
					System.out.print(str + " ");
				}
				break;
			case 2:
				if (list == null || list.size() == 0) {
					System.out.println("단어가 등록되지 않았습니다.");
					return;
				}

				System.out.println("1. 대문자 2. 소문자");
				System.out.println("입력> ");

				int charCaseNo = Integer.parseInt(sc.nextLine());

				if (charCaseNo == 1) {
					for (String str : list) {
						System.out.println(str.toUpperCase() + " ");
					}
				} else if (charCaseNo == 2) {
					for (String str : list) {
						System.out.println(str.toLowerCase() + " ");
					}
				}
				break;
			case 3:
				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < list.size(); i++) {
					sb.append(list.get(i));
				}
				
				System.out.println("입력한 문자의 총길이 : " + sb.length());
				break;
			case 4:
				System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
				
				int i = 0;
				for (String str : list) {
					System.out.println(i + "번째 단어 : " + str);
					i++;
				}
				
				System.out.println("입력> ");
				int idx = Integer.parseInt(sc.nextLine());
				
				String word = list.get(idx);
				
				System.out.println(word.substring(Math.round(word.length() / 2)));				
				break;
			case 5:
				System.out.println("단어입력> ");
				String str = sc.nextLine();
				System.out.println("입력하신 단어: " + str);
				System.out.println("구분자 입력> ");
				String splits = sc.nextLine();
				String[] token = str.split(splits);
				
				for (String str2 : token) {
					System.out.println(str2);
				}
				break;
			}
		}
	}

}

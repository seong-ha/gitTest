package pshProf.lesson0804.mapEx;

import java.util.HashMap;
import java.util.Scanner;

// 사전
// 1. 단어등록 2. 사전 전체 조회 3. 단어 검색 4. 단어 수정 5. 단어 삭제
public class MapApp {
	HashMap<String, String> dictionary = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	String menuNo = "";

	public MapApp() {
		run();
	}

	private void run() {

		while (!menuNo.equals("99")) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("1. 단어 등록 | 2. 사전 전체 조회 | 3. 단어 검색 | 4. 단어 수정 | 5. 단어 삭제 | 99. 종료");
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("메뉴를 선택하세요. (1 ~ 5) > ");

			menuNo = sc.nextLine();

			if (menuNo.equals("1")) {
				String word = "";
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.print("단어 입력 > ");
					word = sc.nextLine();
					if (word.equalsIgnoreCase("q")) {
						break;
					}
					System.out.println("단어의 뜻을 입력하세요.");
					System.out.print("뜻 입력 > ");
					String mean = sc.nextLine();

					dictionary.put(word, mean);
				}
			} else if (menuNo.equals("2")) {
				if (dictionary.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
				} else {
					System.out.println("---- |§ 사전 목록 §| ----");

					for (String key : dictionary.keySet()) {
						String value = dictionary.get(key);
						System.out.printf("단어명: %10s, 뜻: %10s\n", key, value);
					}
				}
			} else if (menuNo.equals("3")) {
				System.out.println("검색할 단어를 입력하세요.");
				System.out.print("단어 입력 > ");
				String key = sc.nextLine();

				if (dictionary.containsKey(key)) {
					String value = dictionary.get(key);
					System.out.printf("단어명: %10s, 뜻: %10s\n", key, value);
				} else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			} else if (menuNo.equals("4")) {
				System.out.println("수정할 단어를 입력하세요.");
				System.out.print("단어 입력 > ");
				String key = sc.nextLine();

				if (dictionary.containsKey(key)) {
					System.out.println("수정할 뜻을 입력하세요.");
					System.out.print("뜻 입력 > ");
					String value = sc.nextLine();
					dictionary.put(key, value);
					System.out.println("단어 수정이 완료되었습니다.");
				} else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			} else if (menuNo.equals("5")) {
				System.out.println("1. 1건 삭제 | 2. 전체 삭제");
				System.out.print("삭제 메뉴를 선택하세요. > ");
				String deleteMenu = sc.nextLine();

				if (deleteMenu.equals("1")) {
					System.out.println("삭제할 단어를 입력하세요.");
					System.out.print("단어 입력 > ");
					String key = sc.nextLine();
					
					if (dictionary.containsKey(key)) {
						dictionary.remove(key);
						
						if (!dictionary.containsKey(key)) {
							System.out.println("삭제 완료.");
						} else {
							System.out.println("삭제 되지 않았습니다. 관리자에게 문의하세요.");
						}
					} else {
						System.out.println("등록되지 않은 단어입니다.");
					}
				} else if (deleteMenu.equals("2")) {
					dictionary.clear();
					if (dictionary.size() == 0) {
						System.out.println("전체 삭제 완료.");
					} else {
						System.out.println("삭제 되지 않았습니다. 관리자에게 문의하세요.");
					}
				}
			}

		}
		System.out.println("사전 종료");
	}

}

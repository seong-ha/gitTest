package co.edu.reference;

import java.util.Scanner;

public class MorningEx {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (scores == null) {
				if (!(selectNo == 1 || selectNo == 5)) {
					System.out.println("학생 수를 먼저 지정하세요!!");
					continue;
				}
				
			} else if (selectNo == 1) {
				System.out.print("학생 수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				System.out.println("학생 수 입력이 정상적으로 처리되었습니다.");
				
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println("점수입력이 정상적으로 처리되었습니다.");
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				System.out.println("점수리스트가 정상적으로 출력되었습니다.");
				
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;

				for (int num : scores) {
					if (max < num) {
						max = num;
					}
					sum += num;
				}

				double avg = (double) sum / scores.length;

				System.out.printf("최고 점수: %d\n평균 점수: %.14f\n", max, avg);
				System.out.println("분석이 완료되었습니다.");
				
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

}

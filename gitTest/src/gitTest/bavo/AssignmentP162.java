package gitTest.bavo;

import java.util.Scanner;

public class AssignmentP162 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
				case 1:
					System.out.print("예금액> ");	
					balance += Integer.parseInt(scanner.nextLine());
					continue;
				case 2:
					System.out.print("출금액> ");
					int input2 = Integer.parseInt(scanner.nextLine());
					
					if (balance < input2) {
						System.out.println("잔액이 부족합니다.");
					} else {
						balance -= input2;
					}
					continue;
				case 3:
					System.out.println("잔고> " + balance);
					continue;
				case 4:
					run = false;
					break;
				default:
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		
		}
		System.out.println("프로그램 종료");
	}

}

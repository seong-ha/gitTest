package gitTest.bavo;

import java.util.Scanner;

public class AssignmentP162 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
				case 1:
					System.out.print("���ݾ�> ");	
					balance += Integer.parseInt(scanner.nextLine());
					continue;
				case 2:
					System.out.print("��ݾ�> ");
					int input2 = Integer.parseInt(scanner.nextLine());
					
					if (balance < input2) {
						System.out.println("�ܾ��� �����մϴ�.");
					} else {
						balance -= input2;
					}
					continue;
				case 3:
					System.out.println("�ܰ�> " + balance);
					continue;
				case 4:
					run = false;
					break;
				default:
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �������ּ���.");
			}
		
		}
		System.out.println("���α׷� ����");
	}

}

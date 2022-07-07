package co.edu.emp;

import java.util.Scanner;

// 배열, 부서초기화, 입력, 조회, 전체출력
public class EmployeeList {
	private static EmployeeList instance = new EmployeeList();

	private EmployeeList() {
	}

	public static EmployeeList getInstance() {
		return instance;
	}

	Employee[] list; // 사원 배열
	int empNum; // 사원 수..? 사번...?
	Scanner scn = new Scanner(System.in);

	public void init() {
		System.out.print("사원 수 입력> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	public void input() {
		if (empNum >= list.length) {
			System.out.println("지정된 사원 수를 초과했습니다.");
			return;
		}

		System.out.printf("%d 사번> ", empNum);
		int no = Integer.parseInt(scn.nextLine());

		System.out.print("이름> ");
		String name = scn.nextLine();

		System.out.print("급여> ");
		int sal = Integer.parseInt(scn.nextLine());

		list[empNum++] = new Employee(no, name, sal);

		System.out.println("정상적으로 사원이 추가되었습니다.");
	}

	public void search() {
		System.out.print("조회할 사원번호 입력> ");
		int employeeId = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < empNum; i++) {
			if (list[i] != null && list[i].getEmployeeId() == employeeId) {
				System.out.println(list[i].getDetailInfo());
				break;
			} else {
				if (i == empNum - 1) {
					System.out.println("해당 사원은 없습니다.");
				}
			}
		}
	}

	public void printList() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	private int getLastDate(int month) {
		switch (month) {
			case 2: case 4: case 6: case 9: case 11:
				return 30;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			default:
				return 28;
		}
	}

	private int getDayInfo(int month) {
		switch (month) {
			case 1:
				return 6;
			case 2:
				return 2;
			case 3:
				return 2;
			case 4:
				return 5;
			case 5:
				return 0;
			case 6:
				return 3;
			case 7:
				return 5;
			case 8:
				return 1;
			case 9:
				return 4;
			case 10:
				return 6;
			case 11:
				return 2;
			case 12:
				return 4;
			default:
				return 0;
		}
	}
	
	
	public void showCalendar() {
		System.out.print("월을 입력> ");
		int month = Integer.parseInt(scn.nextLine());
		
		String[] days = { "Sun", "Mon", "Tue", "wed", "Thu", "Fri", "Sat" };
		int firstDay = getDayInfo(month); // 일: 0 월:1 화:2 수:3 목:4 금:5 토:6
		int lastDay = getLastDate(month);

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		for(int i = 0; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}
		
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%4d", i);
			if((i + firstDay) % 7 == 0) {
				System.out.println();
			}
		}
	}
}

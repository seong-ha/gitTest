package co.edu.emp;

import java.util.Calendar;
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

	private int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, 1);
		
		return cal.getActualMaximum(Calendar.DATE);
	}
	
	private int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, 0);
		
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public void showCalendar() {
		System.out.print("년을 입력> ");
		int year = Integer.parseInt(scn.nextLine());
		
		System.out.print("월을 입력> ");
		int month = Integer.parseInt(scn.nextLine());
		
		String[] days = { "Sun", "Mon", "Tue", "wed", "Thu", "Fri", "Sat" };
		int firstDay = getDayInfo(year, month); // 일: 0 월:1 화:2 수:3 목:4 금:5 토:6
		int lastDay = getLastDate(year, month);

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

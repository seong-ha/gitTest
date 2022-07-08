package co.edu.emp;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println();
		
		int year = 2022;
		int month = 8;
//		System.out.printf("%d년 %d월의 마지막 날짜는 %d일 입니다.\n", year, month, getLastDate(year, month));
//		System.out.printf("%d년 %d월의 1일의 요일정보는 %d요일 입니다.\n", year, month, getDayInfo(year, month));
		
	}

	public int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, 1);
		
		return cal.getActualMaximum(Calendar.DATE);
	}
	
	public int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, 1);
		
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}

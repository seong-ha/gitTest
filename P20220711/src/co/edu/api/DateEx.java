package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date today = new Date(); // Date는 거의 Deprecated되고 대신에 LocalDate, LocalDateTime이 나옴.
		today.getDate();
		today.getDay();
		System.out.println(today.toString());
//		System.out.println(today.toGMTString());
//		System.out.println(today.toLocaleString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(today));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(today));
		
		today = new Date("2022/07/15 13:23:12");
		System.out.println(sdf.format(today));
		
		
		// Calendar
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR) + "년");
		int month = now.get(Calendar.MONTH);
		
		now.set(2022,  10, 11);
		System.out.println(now.get(Calendar.DATE) + "일");
		
		// LocalDate
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ld.format(dtf) + " -> dtf");
	}

}

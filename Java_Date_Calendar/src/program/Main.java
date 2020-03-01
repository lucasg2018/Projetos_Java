package program;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date now = new Date();
		
		System.out.println(sdf1.format(now));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		now = cal.getTime();
		
		System.out.println();
		System.out.println(sdf1.format(now));
		
		cal.setTime(now);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int month = 1 + cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		
		System.out.println("Minutes: " + minute);
		System.out.println("Seconds: " + second);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
}
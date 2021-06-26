package com.khauminhduy.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate myBirthDay = LocalDate.of(1998, Month.DECEMBER, 6);
		System.out.println(myBirthDay);
		
		Period until = myBirthDay.until(date);
		System.out.println("# Year: " + until.getYears());
		
		long day = myBirthDay.until(date, ChronoUnit.DAYS);
		System.out.println(day);
		
		Month month = Month.of(12);
		System.out.println(month);
		
		LocalDate nextSunday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(nextSunday);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.stream()
			.sorted(String::compareTo)
			.forEach(e -> {
				if(e.startsWith("Asia/")) {
					System.out.println(e);
				}
			});
		
	}

}

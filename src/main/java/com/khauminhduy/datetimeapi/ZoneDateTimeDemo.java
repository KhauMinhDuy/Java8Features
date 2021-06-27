package com.khauminhduy.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.of (
				LocalDate.of(2021, Month.JUNE, 27), 
				LocalTime.of(12, 38),
				ZoneId.of("Asia/Ho_Chi_Minh")
			);
		System.out.println(zonedDateTime);
	}

}

package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.*;
//import java.time.format.*;

//exercise Date And Time
public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);

		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);

		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);

		LocalDate towmonthelatter = localdate.plusMonths(2);
		System.out.println(towmonthelatter);

		LocalDate pluseday = localdate.plusDays(2);
		System.out.println(pluseday);

		LocalDate twoweeksleter = localdate.plusWeeks(2);
		System.out.println(twoweeksleter);

		ZonedDateTime zonedatetime = ZonedDateTime.now();
		System.out.println(zonedatetime);

		ZoneId berlin = ZoneId.of("Europe/Berlin");
		ZonedDateTime mumb = zonedatetime.withZoneSameInstant(berlin);
		System.out.println(mumb);

		OffsetDateTime offsettime = OffsetDateTime.now();
		System.out.println(offsettime);

		ZonedDateTime time = ZonedDateTime.now();
		DateTimeFormatter datetimeformatter = DateTimeFormatter.ISO_LOCAL_DATE;
		String formater = datetimeformatter.format(time);
		System.out.println(formater);

		// custom date and time
		String format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(time);
		System.out.println(format);

		// custom date and time
		String format1 = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss").format(time);
		System.out.println(format1);
		
		System.out.println("-------------------------");
		//------------------------------------------------//
		LocalDate date = LocalDate.parse("2022-05-16");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		System.out.println("-------------------------");
		
		LocalDate bday = LocalDate.of(2052,03,10);
		System.out.println(bday.minusDays(10));
		System.out.println(bday.minusMonths(2));
		System.out.println(bday.minusWeeks(30));
		System.out.println(bday.minusYears(1));
		
		//-----------------------------------------------//
		System.out.println("-------------------------");

		//Quering local time
		LocalTime time1 = LocalTime.of(16, 20, 12, 98547);
		System.out.println(time1.getHour());
		System.out.println(time1.getMinute());
		System.out.println(time1.getSecond());
		System.out.println(time1.getNano());
		
	}

}

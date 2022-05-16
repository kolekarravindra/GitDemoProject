package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

		ZoneId mumbai = ZoneId.of("Europe/Berlin");
		ZonedDateTime mumb = zonedatetime.withZoneSameInstant(mumbai);
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
	}

}

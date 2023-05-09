package com.java.time;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        //Date functions
        System.out.println("\n----------- Date Functions ------------");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date is :" + currentDate);
        System.out.print("Currently the date is,     \nMonth:" + currentDate.getMonth() + "(" + currentDate.getMonthValue() + ")    date:" + currentDate.getDayOfMonth() + "   year:" + currentDate.getYear());
        System.out.print("     From 365 days today is: " + currentDate.getDayOfYear());

        // Time functions
        System.out.println("\n\n----------- Time Functions ------------");
        LocalTime time = LocalTime.now();
        System.out.println("The current time is: " + time);
        System.out.println("Currently the time is,   \nHours:" + time.getHour() + "   Minutes:" + time.getMinute() + "    Seconds:" + time.getSecond() + "    Nanoseconds:" + time.getNano());

        // Combined function
        System.out.println("\n\n----------- Date & Time Functions ------------");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date and time is: \n" + dt + "    (Here we can use all the methods of LocalDate and LocalTime class)\n");
        dt = LocalDateTime.of(2023, 2, 7, 11, 00);
        System.out.println("Customized selected date using LocalDateTime \ndate:" + dt.getDayOfMonth() + "-" + dt.getMonth() + "-" + dt.getYear() + "      & time:" + dt.toLocalTime());

        // performing operations in date
        System.out.println("\n\n----------- Operations in date & time ------------");
        System.out.println("Selected date is:" + dt.toLocalDate() + " \nAfter 6 months the internship would be completed i.e. on " + dt.plusMonths(6).toLocalDate());
        LocalDate internshipStartDate = LocalDate.of(2023, 2, 7);
        Period internshipCompletedMonth = Period.between(internshipStartDate, currentDate);
        System.out.println("Total months completed in internship :" + internshipCompletedMonth.getMonths());
        System.out.println("Current year is leap year" + currentDate.isLeapYear());

        // working with zone
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Your current zone is: " + currentZone);
        System.out.println("List of different zones:\n" + ZoneId.getAvailableZoneIds());
        ZoneId marigotZone = ZoneId.of("America/Marigot");
        ZonedDateTime marigotZoneTime = ZonedDateTime.now(marigotZone);
        System.out.println("In America/Marigot , timezone rules :" + marigotZone.getRules() + "     zonedDateTime :" + marigotZoneTime.toLocalTime());
    }
}
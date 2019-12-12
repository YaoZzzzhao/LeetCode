package Practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAPIPractice {
    public static void LocalDateAPIPractice(){
        // the current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is "+date);

        // the current date
        LocalTime time = LocalTime.now();
        System.out.println("The current time is "+time);

        // the current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The current date and time is "+dateTime);

        // print the date and time in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("YY-MM-dd HH:mm:ss");
        String formatteddt = dateTime.format(format);
        System.out.println("The formatted date and time is "+ formatteddt);

        // print the day of month and seconds
        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int sec = dateTime.getSecond();
        System.out.println("Month: "+month+" Day: "+day+" Second: "+ sec);

        // print specific date
        LocalDate date2 = LocalDate.of(1900,12,5);
        System.out.println("The specific date is "+date2);

        // print date with current time
        LocalDateTime sameTimeDifferDate = dateTime.withDayOfMonth(19).withMonth(3).withYear(2000);
        System.out.println("The same time with different date: " + sameTimeDifferDate);
    }

    public static void ZonedDateAndTime(){
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY HH:mm:ss");
        String formattedDateTime = current.format(formatter);

        // get the current time zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("The current time zone is " + currentZone.getZone());

        // change the time zone to a specific zone
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        ZonedDateTime shanghaiZone = currentZone.withZoneSameInstant(shanghai);
        System.out.println("The current time in Beijing is "+ shanghaiZone);

        // print the formatted Shanghai time
        System.out.println("The formatted Shanghai zone time: "+shanghaiZone.format(formatter));
    }

    public static void main(String[] args) {
//        LocalDateAPIPractice();
        ZonedDateAndTime();
    }
}

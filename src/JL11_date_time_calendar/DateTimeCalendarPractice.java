package JL11_date_time_calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

// Display current time with different methods
public class DateTimeCalendarPractice {
    public static void main(String[] args) {
        // Using Date Class
        Date date = new Date();
        System.out.print("Time Using Date Class : ");
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

        // Using Calendar Class
        Calendar calendar = Calendar.getInstance();
        System.out.print("Time Using Calendar Class : ");
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        // Using LocalDateTime Class
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:mm:ss");
        System.out.print("Time Using LocalDateTime Class : ");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
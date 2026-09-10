package JL11_date_time_calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeCalendar {
    public static void main(String[] args) {

        // 1. DATE - LEGACY DATE API
//           java.util.Date is a legacy class used to represent a point in time.
//           Internally, a Date is associated with milliseconds from the Unix epoch:
//           1 January 1970, 00:00:00 UTC
//           Date is still encountered in older Java projects, but for new Java development, prefer the java.time API.

        Date currentDate = new Date();

        // Displays the current date and time.
        System.out.println("Current Date : " + currentDate);

        // Returns milliseconds since the Unix epoch.
        long milliseconds = currentDate.getTime();  // The value is stored in a long because the number of milliseconds can be much larger than the range supported by an int.
        System.out.println("Milliseconds since epoch : " + milliseconds);
        System.out.println("Max value of Long : " + Long.MAX_VALUE);

//          Legacy Date constructor:
//          Date(int year, int month, int date)
//          - year is counted from 1900
//          - month is zero-based (January = 0)
//          - date represents the day of the month
//          Example: new Date(126, 7, 18)
//          Year  = 1900 + 126 = 2026
//          Month = 7 + 1 = August
//          Day   = 18
//          Therefore, it represents: 18 August 2026
//
//          This constructor is deprecated and should NOT be used
//          in modern Java code. It is included here to understand
//          the legacy Date API.
        Date legacyDate = new Date(126, 7, 18);

        System.out.println("Legacy Date : " + legacyDate);

        // Comparing Date objects
        Date date1 = new Date();
        Date date2 = new Date();

        // Checks whether date1 occurs before date2.
        System.out.println("date1 before date2 : " + date1.before(date2));

        // Checks whether date1 occurs after date2.
        System.out.println("date1 after date2  : " + date1.after(date2));

        // Checks whether both represent the same point in time.
        System.out.println("date1 equals date2  : " + date1.equals(date2));

        // 2. CALENDAR - LEGACY CALENDAR API
//           Calendar provides more control over individual calendar
//           fields such as year, month, day, hour, minute and second.
//           Calendar is mutable, unlike most classes in java.time.

        // Calendar.getInstance() is a static factory method used to create and instantiate a Calendar object.
        // Because java.util.Calendar is an abstract class,
        // you cannot instantiate it directly using the new keyword.
        Calendar calendar = Calendar.getInstance();
        // Calling Calendar.getInstance() returns a concrete subclass instance (usually GregorianCalendar)
        // initialized with the current system date, time, default time zone, and locale.

        System.out.println("\n----- Calendar -----");

        // get() retrieves a particular calendar field.
        System.out.println("Calender Type : " + calendar.getCalendarType());
        System.out.println("Time Zone     : " + calendar.getTimeZone());
        System.out.println("Time Zone Id  : " + calendar.getTimeZone().getID());
        System.out.println("Year          : " + calendar.get(Calendar.YEAR));

//           Calendar.MONTH is zero-based.
//           January  = 0
//           February = 1
//           ...
//           December = 11
//           Therefore +1 is used for a normal human-readable month.
        System.out.println("Month         : " + (calendar.get(Calendar.MONTH) + 1));

        System.out.println("Day           : " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Day of Week   : " + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("Hour          : " + calendar.get(Calendar.HOUR));

        System.out.println("Minute        : " + calendar.get(Calendar.MINUTE));

        System.out.println("Second        : " + calendar.get(Calendar.SECOND));

        // Calendar.set()
        //  set() directly changes a calendar field.
        // Example: "Set the day of the month to 15."
        calendar.set(Calendar.DAY_OF_MONTH, 15);

        System.out.println("After set() : " + calendar.getTime());

        // Calendar.add()
        //  add() moves a calendar field by the given amount.
        //  Positive value -> move forward
        //  Negative value -> move backward
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println("After adding 5 days : " + calendar.getTime());

        calendar.add(Calendar.MONTH, -2);

        System.out.println("After subtracting 2 months : " + calendar.getTime());


        // GREGORIAN CALENDAR
//          GregorianCalendar is a concrete subclass of Calendar.
//          Calendar is an abstract class, while GregorianCalendar provides
//          an actual implementation of the Gregorian calendar system.
//          It supports calendar fields such as: Year, Month, Day, Hour, Minute, Second, etc.
//          GregorianCalendar inherits the same Calendar rules:
//          - MONTH is zero-based
//          - Calendar is mutable

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("\n----- GregorianCalendar -----");

        System.out.println("Year : " + gregorianCalendar.get(Calendar.YEAR));

        System.out.println("Month : " + (gregorianCalendar.get(Calendar.MONTH) + 1));

        System.out.println("Day : " + gregorianCalendar.get(Calendar.DAY_OF_MONTH));

//          GregorianCalendar can also be created with a specific date and time.
//          Month is still zero-based because it follows Calendar's rules.
//          2026, 7, 18 means:
//          2026
//          August (7 + 1)
//          18
        GregorianCalendar specificGregorianDate = new GregorianCalendar(2026, 7, 18);

        System.out.println("Specific Gregorian Date : " + specificGregorianDate.getTime());

        // GregorianCalendar also supports add().
        specificGregorianDate.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println("After adding 5 days : " + specificGregorianDate.getTime());

        System.out.println("Check if 2018 is a Leap Year : " + gregorianCalendar.isLeapYear(2018));
        System.out.println("Check if 2024 is a Leap Year : " + gregorianCalendar.isLeapYear(2024));

        // TIMEZONE - LEGACY API
//          TimeZone represents a time zone and its associated rules.
//          Examples:
//          Asia/Kolkata
//          Europe/London
//          America/New_York
//          Asia/Tokyo
//          TimeZone is part of the legacy java.util date/time API.
//          Modern Java generally uses:    java.time.ZoneId instead.

        // Gets the system's default timezone.
        TimeZone defaultTimeZone = TimeZone.getDefault();

        System.out.println("\n----- TimeZone -----");

        System.out.println("Available Time Zone at index 0 : " + TimeZone.getAvailableIDs()[0]);

        System.out.println("Default TimeZone : " + defaultTimeZone.getID());

        // Gets a specific timezone.
        TimeZone indiaTimeZone = TimeZone.getTimeZone("Asia/Kolkata");

        System.out.println("India TimeZone : " + indiaTimeZone.getID());

        // Returns the raw offset from UTC in milliseconds.
        System.out.println("Raw Offset (ms) : " + indiaTimeZone.getRawOffset());

        // 3. LOCAL DATE
        //  LocalDate belongs to the modern java.time API.
        //  It represents:     DATE ONLY
        //  It contains:   Year + Month + Day
        //  It does NOT contain: Time, Time zone

        // LocalDate.now() is a static factory method used to capture the current system date (year, month, and day)
        // without any time or time-zone information.
        LocalDate today = LocalDate.now();

        System.out.println("\n----- LocalDate -----");
        System.out.println("Today : " + today);

        // Creates a specific date.
        LocalDate specificDate = LocalDate.of(2026, 8, 18);
        // LocalDate.of() is a static factory method used to create an instance of LocalDate by explicitly specifying the year, month, and day.
        // Since LocalDate objects are immutable, this method returns a brand-new date instance without modifying any existing data.

        System.out.println("Specific Date : " + specificDate);

        // Getting values from LocalDate
        System.out.println("Year        : " + specificDate.getYear());

        // Returns the month as an enum, e.g. AUGUST.
        System.out.println("Month       : " + specificDate.getMonth());

        // Returns normal month number: January = 1, December = 12.
        System.out.println("Month Value : " + specificDate.getMonthValue());

        System.out.println("Day         : " + specificDate.getDayOfMonth());

        System.out.println("Day of Week : " + specificDate.getDayOfWeek());

        System.out.println("Day of Year : " + specificDate.getDayOfYear());

        // Adding and subtracting dates
//           LocalDate is immutable.
//           plusDays() does NOT modify specificDate.
//           It returns a NEW LocalDate object.
        LocalDate futureDate = specificDate.plusDays(10);

        LocalDate pastDate = specificDate.minusDays(10);

        System.out.println("10 days later : " + futureDate);
        System.out.println("10 days earlier : " + pastDate);

        // Other useful methods:
        LocalDate nextWeek = specificDate.plusWeeks(1);

        LocalDate nextMonth = specificDate.plusMonths(1);

        LocalDate nextYear = specificDate.plusYears(1);

        System.out.println("Next week  : " + nextWeek);
        System.out.println("Next month : " + nextMonth);
        System.out.println("Next year  : " + nextYear);

        // Comparing LocalDate objects
        LocalDate dateA = LocalDate.of(2026, 8, 10);

        LocalDate dateB = LocalDate.of(2026, 8, 20);

        System.out.println("dateA before dateB : " + dateA.isBefore(dateB));

        System.out.println("dateA after dateB : " + dateA.isAfter(dateB));

        System.out.println("dateA equals dateB : " + dateA.isEqual(dateB));

        // 4. LOCAL TIME
//           LocalTime represents:     TIME ONLY
//           It does NOT contain: Date, Time zone

        LocalTime currentTime = LocalTime.now();

        System.out.println("\n----- LocalTime -----");
        System.out.println("Current Time : " + currentTime);

        // Creates a specific time.
        LocalTime specificTime = LocalTime.of(14, 30, 45);

        System.out.println("Specific Time : " + specificTime);

        // Getting individual time components.
        System.out.println("Hour   : " + specificTime.getHour());
        System.out.println("Minute : " + specificTime.getMinute());
        System.out.println("Second : " + specificTime.getSecond());
        System.out.println("Nano   : " + specificTime.getNano());

        // Adding/subtracting time.
        LocalTime laterTime = specificTime.plusHours(2).plusMinutes(30);

        LocalTime earlierTime = specificTime.minusMinutes(20);

        System.out.println("Later Time   : " + laterTime);
        System.out.println("Earlier Time : " + earlierTime);

        // Comparing times.
        System.out.println("specificTime before laterTime : " + specificTime.isBefore(laterTime));

        System.out.println("specificTime after laterTime : " + specificTime.isAfter(laterTime));

        // 5. LOCAL DATETIME
//           LocalDateTime represents:    DATE + TIME
//           It does NOT contain timezone information.

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("\n----- LocalDateTime -----");
        System.out.println("Current Date & Time : " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2026, 8, 18, 14, 30, 45);

        System.out.println("Specific Date & Time : " + specificDateTime);

        // Date/time manipulation.
        LocalDateTime modifiedDateTime = specificDateTime.plusDays(5).plusHours(2).minusMinutes(30);

        System.out.println("Modified Date & Time : " + modifiedDateTime);

        // 6. ZONE ID
//           ZoneId represents a time-zone identifier.
//           Examples:
//           Asia/Kolkata
//           Europe/London
//           America/New_York
//           Asia/Tokyo

        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");

        ZoneId londonZone = ZoneId.of("Europe/London");

        System.out.println("\n----- ZoneId -----");
        System.out.println("India Zone  : " + indiaZone);
        System.out.println("London Zone : " + londonZone);


        // 7. ZONED DATETIME
//           ZonedDateTime represents:     DATE + TIME + TIMEZONE
//           Use this when timezone information matters.

        ZonedDateTime indiaDateTime = ZonedDateTime.now(indiaZone);

        ZonedDateTime londonDateTime = ZonedDateTime.now(londonZone);

        System.out.println("\n----- ZonedDateTime -----");
        System.out.println("India  : " + indiaDateTime);
        System.out.println("London : " + londonDateTime);

        // Converting the same instant to another timezone.
        ZonedDateTime londonFromIndia = indiaDateTime.withZoneSameInstant(londonZone);

        System.out.println("Same instant in London : " + londonFromIndia);

        // 8. INSTANT
//           Instant represents an exact point on the global timeline.
//           It is based on UTC and is useful for:
//           - server timestamps
//           - logs
//           - database timestamps
//           - API timestamps
//           - transaction/event times

        Instant instantNow = Instant.now();

        System.out.println("\n----- Instant -----");
        System.out.println("Current Instant : " + instantNow);

        // Seconds from Unix epoch.
        System.out.println("Epoch Seconds : " + instantNow.getEpochSecond());

        // Milliseconds from Unix epoch.
        System.out.println("Epoch Milliseconds : " + instantNow.toEpochMilli());

        // 9. PERIOD
//           Period represents a DATE-BASED amount of time.
//           Think:     Years + Months + Days
//           It is generally used with LocalDate.

        LocalDate startDate = LocalDate.of(2020, 1, 1);

        LocalDate endDate = LocalDate.of(2026, 8, 18);

        Period period = Period.between(startDate, endDate);

        System.out.println("\n----- Period -----");
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());

        // 10. DURATION
//           Duration represents a TIME-BASED amount.
//           Think:     Hours + Minutes + Seconds + Nanoseconds
//           It is useful when measuring elapsed time.

        LocalTime startTime = LocalTime.of(10, 0);

        LocalTime endTime = LocalTime.of(12, 30);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("\n----- Duration -----");

        // Total hours contained in the duration.
        System.out.println("Hours : " + duration.toHours());

        // Total minutes contained in the duration.
        System.out.println("Minutes : " + duration.toMinutes());

        // Total seconds contained in the duration.
        System.out.println("Seconds : " + duration.toSeconds());

        // 11. DATETIME FORMATTER
//           DateTimeFormatter is used for: Formatting, Parsing
//           Formatting: Date/Time Object → String
//           Parsing: String → Date/Time Object

        LocalDateTime now = LocalDateTime.now();

        // Custom date/time format.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = now.format(formatter);

        System.out.println("\n----- DateTimeFormatter -----");
        System.out.println("Formatted Date & Time : " + formattedDateTime);

//           IMPORTANT FORMAT SYMBOLS:
//           dd   → day
//           MM   → month
//           yyyy → year
//           HH   → 24-hour format
//           hh   → 12-hour format
//           mm   → minute
//           ss   → second
//           a    → AM/PM
//           MM = month
//           mm = minute

        // Parsing String → LocalDate
        String dateString = "18-08-2026";

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);

        System.out.println("Parsed Date : " + parsedDate);

//           LEGACY API:
//           Date
//           Calendar
//           These are important to understand because they appear in older Java applications.
//
//           MODERN API:
//           LocalDate
//               → date only
//           LocalTime
//               → time only
//           LocalDateTime
//               → date + time
//           ZoneId
//               → timezone
//           ZonedDateTime
//               → date + time + timezone
//           Instant
//               → exact global moment
//           Period
//               → years/months/days
//           Duration
//               → hours/minutes/seconds
//           DateTimeFormatter
//               → formatting + parsing
//
//           FOR NEW JAVA DEVELOPMENT: Prefer java.time instead of Date/Calendar.

        // In Java, an API (Application Programming Interface) is a large collection
        // of pre-written classes, interfaces, packages, and methods
        // that help software components communicate and interact.
    }
}
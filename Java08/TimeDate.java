
/*
 * 
 * 
 * 
 * 1. LocalDate: Represents a date without a time zone.
   2 LocalTime: Represents a time without a date or time zone.
   3.LocalDateTime: Represents a date and time without a time zone.
4.ZonedDateTime: Represents a date and time with a time zone.
5. Instant: Represents an instantaneous point on the timeline, typically used for machine timestamps.
6. Duration: Represents a duration of time between two points in time.
7 .Period: Represents a period of time between two dates.
8. DateTimeFormatter: Formats and parses dates and times
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


public class TimeDate {

    public static void main(String[] args) {
        /*
         * Local date
         */
        LocalDate now =LocalDate.now();//Obtains a current date from system clock
        System.out.println("Cuurent date yyyy-mm-dd= "+now);
        int dayofmonth =now.getDayOfMonth();
        System.out.println("Current date dd = "+dayofmonth);
        String getdayofweek=now.getDayOfWeek().toString();
        System.out.println("Current day Of Week = "+getdayofweek);
        int dayofyear= now.getDayOfYear();
        System.out.println("Current day of a year = "+dayofyear);
        String month=now.getMonth().toString();
        System.out.println("Current month = "+month);
        int year=now.getYear();
        System.out.println("Current Year = "+year);

        /*
         * Yesterday Logic/Previous date
         */
      LocalDate yesterday = now.minusDays(1);
      System.out.println("Yesterday is = "+yesterday);

      LocalDate pastedate=now.minusMonths(100);
      System.out.println("100 monthes pastte date = "+pastedate);
    


        /*
         * How to create custom date
         */
        LocalDate customedate=LocalDate.of(1990, 2, 10);


        /*
         * Local Time
         */

         LocalTime timenow=LocalTime.now();
         System.out.println("Current Time is = "+timenow);


         /*
          * LocalDAteTime
          */
         LocalDateTime datetime=LocalDateTime.now();
         System.out.println("Local DAte Time ="+datetime);


         /*
          * ZonedateTime
          */

         ZonedDateTime zonetime=ZonedDateTime.now();
         System.out.println("Zone Time = "+zonetime);

       /*
       Set<String> availabletimezone=ZoneId.getAvailableZoneIds();
         availabletimezone.forEach(System.out::println);
        */  


        /*
         * Create Instants
         */
        Instant instime=Instant.now();
        System.out.println("Instant Time = "+instime);


        
    }

  
   
    
}
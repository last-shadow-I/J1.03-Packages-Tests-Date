import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
  public static String getDifferenceDates(String dateTimeUtc, String timeZone1, String timeZone2) {
    ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeUtc);
    ZoneId zoneId1 = ZoneId.of(timeZone1);
    ZoneId zoneId2 = ZoneId.of(timeZone2);

    ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(zoneId1);
    ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(zoneId2);

    if(zonedDateTime1.getYear() != zonedDateTime2.getYear()){
      return "YEAR";
    } else if(zonedDateTime1.getMonth() != zonedDateTime2.getMonth()){
      return "MONTH";
    } else if(zonedDateTime1.getDayOfMonth() != zonedDateTime2.getDayOfMonth()){
      return "DAY";
    } else if(zonedDateTime1.getHour() != zonedDateTime2.getHour()){
      return "HOUR";
    } else {
      return "0";
    }
  }

  public static void main(String[] args) {

  }
}
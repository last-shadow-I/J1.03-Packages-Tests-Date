import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

  public static int countHolidayBetweenDates(String startDate, String endDate) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate startLocalDate = LocalDate.parse(startDate, dtf);
    LocalDate endLocalDate = LocalDate.parse(endDate, dtf);

    System.out.println();
//    System.out.println(startLocalDate.getDayOfWeek().getValue());
//    System.out.println(endLocalDate.getDayOfWeek().getValue());

    int countHoliday = 0;
    for (LocalDate i = startLocalDate; !i.isAfter(endLocalDate); i = i.plusDays(1)) {
      if(DayOfWeek.SATURDAY.equals(i.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(i.getDayOfWeek())){
        countHoliday++;
      }
    }
    return countHoliday;
  }
  public static void main(String[] args) {

  }
}
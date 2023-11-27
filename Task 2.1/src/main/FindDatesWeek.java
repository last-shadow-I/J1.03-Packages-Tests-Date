import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class FindDatesWeek {

  public static List<LocalDate> getDateRange(int year, int numberWeek){
    LocalDate localDate = LocalDate.ofYearDay(year, 1);

    while (!DayOfWeek.MONDAY.equals(localDate.getDayOfWeek())){
      localDate = localDate.plusDays(1);
    }

    LocalDate startDate = localDate.plusWeeks(numberWeek-1);
    LocalDate endDate = startDate.plusDays(6);

    return List.of(startDate, endDate);
  }
}

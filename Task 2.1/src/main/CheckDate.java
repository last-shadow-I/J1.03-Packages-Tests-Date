import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckDate {

  public static String getIsoDate(LocalDate localDate){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return dtf.format(localDate);
  }

  public static boolean isValidDate(int year, int numberWeek){
    if(year < 0){
      System.err.println("Год " + year + " меньше нуля");
      return false;
    }
    if(!isWeekYear(year, numberWeek)){
      System.err.println("Год " + year + " не имеет такой недели");
      return false;
    }
    return true;
  }

  private static boolean isWeekYear(int year, int numberWeek){
    return numberWeek <= getMaxWeekInYear(year) && numberWeek > 0;
  }

  public static int getMaxWeekInYear(int year) {
    LocalDate localDate = LocalDate.ofYearDay(year, 1);
    LocalDate nextYear= LocalDate.ofYearDay(year + 1, 1);

    while (!DayOfWeek.MONDAY.equals(localDate.getDayOfWeek())){
      localDate = localDate.plusDays(1);
    }

    while (!DayOfWeek.MONDAY.equals(nextYear.getDayOfWeek())){
      nextYear = nextYear.plusDays(1);
    }

    System.err.println("1я неделя " + year + " года начинается " + localDate + " " + localDate.getDayOfWeek());
    System.err.println("1я неделя " + (year + 1) + " года начинается " + nextYear + " " + nextYear.getDayOfWeek());

    localDate = localDate.plusWeeks(50);
    int week = 50;

    while (!localDate.equals(nextYear)){
      localDate = localDate.plusWeeks(1);
      week++;
    }

    System.err.println(week + " недели в " + year + " году\n");

    return week;
  }
}

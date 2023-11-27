import java.time.LocalDate;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // введённые данные
    int year = 2018;
    int weak = 26;

    // проверка
    if(!CheckDate.isValidDate(year, weak)){
      System.err.println("Проверка не пройдена");
    }
    // возвращаемые данные
    List<LocalDate> dateWeek;
    dateWeek = FindDatesWeek.getDateRange(year, weak);

    System.out.println("Диапазон дат: " + CheckDate.getIsoDate(dateWeek.get(0)) + " - " + CheckDate.getIsoDate(dateWeek.get(1)));
  }
}
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDatesWeekTest {

  @Test
  void getDateRangeTest() {
    LocalDate localDate1 = LocalDate.parse("2018-12-24");
    LocalDate localDate2 = LocalDate.parse("2018-12-30");
    assertEquals(List.of(localDate1, localDate2), FindDatesWeek.getDateRange(2018, 52));
    localDate1 = LocalDate.parse("2018-12-31");
    localDate2 = LocalDate.parse("2019-01-06");
    assertEquals(List.of(localDate1, localDate2), FindDatesWeek.getDateRange(2018, 53));
    localDate1 = LocalDate.parse("2018-01-01");
    localDate2 = LocalDate.parse("2018-01-07");
    assertEquals(List.of(localDate1, localDate2), FindDatesWeek.getDateRange(2018, 1));
    localDate1 = LocalDate.parse("2018-06-18");
    localDate2 = LocalDate.parse("2018-06-24");
    assertEquals(List.of(localDate1, localDate2), FindDatesWeek.getDateRange(2018, 25));
  }
}
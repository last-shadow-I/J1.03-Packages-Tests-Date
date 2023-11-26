import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  String[] startDate = {"2023-11-01", "2023-05-01", "2023-01-01", "2023-05-01", "2023-05-07", "2023-05-01", "2023-05-01",
          "2023-05-06", "2023-05-06", "2023-05-01", "2023-01-01"};

  String[] endDate = {"2023-11-01", "2023-05-03", "2023-01-01", "2023-05-06", "2023-05-10", "2023-05-07", "2023-05-08",
          "2023-05-07", "2023-05-09", "2023-05-16", "2023-12-31"};

  int[] countsDay = {0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 105};

  @Test
  void countHolidayBetweenDatesTest() {
    for (int i = 0; i < startDate.length; i++) {
      assertEquals(countsDay[i], Main.countHolidayBetweenDates(startDate[i], endDate[i]));
    }

  }
}
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CheckDateTest {

  @Test
  void getIsoDateTest() {
    LocalDate localDate = LocalDate.parse("2018-12-24");
    assertEquals("2018-12-24", CheckDate.getIsoDate(localDate));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    localDate = LocalDate.parse("23-11-2023", dtf);
    assertEquals("2023-11-23", CheckDate.getIsoDate(localDate));
  }

  @Test
  void isValidDateTest() {
    assertFalse(CheckDate.isValidDate(-1, 23));
    assertTrue(CheckDate.isValidDate(1, 23));
    assertTrue(CheckDate.isValidDate(2018, 53));
    assertFalse(CheckDate.isValidDate(2017, 53));
  }

  @Test
  void getMaxWeekInYearTest() {
    assertEquals(52, CheckDate.getMaxWeekInYear(2015));
    assertEquals(52, CheckDate.getMaxWeekInYear(2016));
    assertEquals(52, CheckDate.getMaxWeekInYear(2017));
    assertEquals(53, CheckDate.getMaxWeekInYear(2018));
    assertEquals(52, CheckDate.getMaxWeekInYear(2019));
    assertEquals(52, CheckDate.getMaxWeekInYear(2020));
    assertEquals(52, CheckDate.getMaxWeekInYear(2021));
    assertEquals(52, CheckDate.getMaxWeekInYear(2022));
    assertEquals(52, CheckDate.getMaxWeekInYear(2023));
  }


}
package main;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthInfoTest {

  @Test
  void initialization() {
    String testData = "2023-12-11";
    var monthInfo = new MonthInfo(testData);
    var monthInfo1 = new MonthInfo();
    assertEquals(testData, monthInfo.toString());
    assertEquals(LocalDate.now(), monthInfo1.getLocalDate());
  }

  @Test
  void getFullNameMonth() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals("февраль", monthInfo.getFullNameMonth());
    assertEquals("апрель", monthInfo1.getFullNameMonth());
    assertEquals("август", monthInfo2.getFullNameMonth());
    assertEquals("декабрь", monthInfo3.getFullNameMonth());
  }

  @Test
  void getNumberMonth() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals("2", monthInfo.getNumberMonth());
    assertEquals("4", monthInfo1.getNumberMonth());
    assertEquals("8", monthInfo2.getNumberMonth());
    assertEquals("12", monthInfo3.getNumberMonth());
  }

  @Test
  void getDayWeekFirstDayMonth() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals("ср", monthInfo.getDayWeekFirstDayMonth());
    assertEquals("сб", monthInfo1.getDayWeekFirstDayMonth());
    assertEquals("вт", monthInfo2.getDayWeekFirstDayMonth());
    assertEquals("пт", monthInfo3.getDayWeekFirstDayMonth());
  }

  @Test
  void getDateLastDayMonth() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals("2023-02-28", monthInfo.getDateLastDayMonth());
    assertEquals("2023-04-30", monthInfo1.getDateLastDayMonth());
    assertEquals("2023-08-31", monthInfo2.getDateLastDayMonth());
    assertEquals("2023-12-31", monthInfo3.getDateLastDayMonth());
  }

  @Test
  void getNumberDaysMonth() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals(28, monthInfo.getNumberDaysMonth());
    assertEquals(30, monthInfo1.getNumberDaysMonth());
    assertEquals(31, monthInfo2.getNumberDaysMonth());
    assertEquals(31, monthInfo3.getNumberDaysMonth());
  }

  @Test
  void getNumberQuarter() {
    var monthInfo = new MonthInfo("2023-02-11");
    var monthInfo1 = new MonthInfo("2023-04-11");
    var monthInfo2 = new MonthInfo("2023-08-11");
    var monthInfo3 = new MonthInfo("2023-12-11");
    assertEquals("2023 Q1", monthInfo.getNumberQuarter());
    assertEquals("2023 Q2", monthInfo1.getNumberQuarter());
    assertEquals("2023 Q3", monthInfo2.getNumberQuarter());
    assertEquals("2023 Q4", monthInfo3.getNumberQuarter());
  }
}
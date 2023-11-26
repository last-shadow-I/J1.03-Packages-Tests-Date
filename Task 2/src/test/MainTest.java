import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  void getDifferenceDatesTest() {

    assertEquals("0",
            Main.getDifferenceDates("2023-11-12T00:00:00Z", "UTC+00", "UTC+00"));
    assertEquals("HOUR",
            Main.getDifferenceDates("2020-06-01T14:25:16Z", "UTC+01", "UTC+02"));
    assertEquals("HOUR",
            Main.getDifferenceDates("2020-06-01T14:25:16Z", "UTC+05", "UTC+01"));
    assertEquals("DAY",
            Main.getDifferenceDates("2023-05-10T23:00:00Z", "UTC-03", "UTC+04"));
    assertEquals("MONTH",
            Main.getDifferenceDates("2024-10-01T04:59:59Z", "UTC-08", "UTC-04"));
    assertEquals("YEAR",
            Main.getDifferenceDates("2010-12-31T20:15:00Z", "Europe/Moscow", "Asia/Vladivostok"));

  }

}
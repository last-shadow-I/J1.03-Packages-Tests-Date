package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthInfo {

  private LocalDate localDate;

  public MonthInfo(String localDate) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    setLocalDate(LocalDate.parse(localDate, dtf));
  }

  public MonthInfo() {
    setLocalDate(LocalDate.now());
  }

  public String getFullNameMonth(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("LLLL");
    return dtf.format(this.localDate);
  }

  public String getNumberMonth(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M");
    return dtf.format(this.localDate);
  }

  public String getDayWeekFirstDayMonth(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eee");
    return dtf.format(this.localDate.withDayOfMonth(1));
  }

  public String getDateLastDayMonth(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    int numberDays = getNumberDaysMonth();
    return dtf.format(this.localDate.withDayOfMonth(numberDays));
  }

  public int getNumberDaysMonth(){
    int numberDays = this.localDate.getMonth().length(this.localDate.isLeapYear());
    return numberDays;
  }

  public String getNumberQuarter(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
    int month = this.localDate.getMonth().getValue();
    int quarter = (month - 1) / 3 + 1; // 1,2,3 => 1  4,5,6 => 2, 7,8,9 => 3  10, 11, 12 => 4
    return dtf.format(this.localDate) + " Q" + quarter;
  }

  public LocalDate getLocalDate() {
    return localDate;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }

  @Override
  public String toString() {
    return localDate.toString();
  }
}

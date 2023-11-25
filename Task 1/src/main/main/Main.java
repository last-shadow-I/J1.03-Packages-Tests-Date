package main;


public class Main {
  public static void main(String[] args) {

    MonthInfo monthInfo = new MonthInfo("2023-12-11");

    System.out.println(monthInfo.getLocalDate());
    System.out.println(monthInfo.getNumberQuarter());

    System.out.println();

    MonthInfo monthInfo1 = new MonthInfo();

    System.out.println(monthInfo1.getLocalDate());
    System.out.println(monthInfo1.getNumberQuarter());

  }
}
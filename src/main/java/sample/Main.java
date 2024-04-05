package sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    List<LocalDate> dates = Stream.of("2004-07-01", "2005-01-02", "2007-01-01", "2032-05-03")
        .map(LocalDate::parse).toList();

    DateSorter dateSorter = new DateSorter();

    Collection<LocalDate> sortedDates = dateSorter.sortDates(dates);

    System.out.println(sortedDates);
  }
}
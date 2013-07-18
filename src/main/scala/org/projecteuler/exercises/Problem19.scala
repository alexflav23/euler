package org.projecteuler.exercises

import java.util.{ Date, Calendar }

object Problem19 {
  var sundays = 1;

  def compute: Int = {
    for (year <- 1901 to 2000; month <- 1 to 12) {
      val day: Date = new Date(year, month, 1, 0, 0)
      if (day.getDay == Calendar.SUNDAY) {
        sundays += 1;
      }
    }
    sundays
  }
}
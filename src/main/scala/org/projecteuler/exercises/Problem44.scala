package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer;

object Problem44 {
  def pentagonal(x: Int): Int = {
    x * (3 * x - 1) / 2
  }

  def isPentagonal(x: Int): Boolean = {
    val y = (math.sqrt(24 * x + 1) + 1) / 6
    y == y.toInt
  }

  def compute: Int = {
    val pents: ListBuffer[Int] = new ListBuffer;
    var i = 0;
    var found = false
    while (!found) {
      i += 1
      val n = pentagonal(i)
      for (j <- i - 1 to 1 by -1) {
        val m = pentagonal(j)
        if (isPentagonal(n - m) && isPentagonal(n + m)) {
          found = true
          return math.abs(n - m)
        }
      }
    }
    0;
  }
}
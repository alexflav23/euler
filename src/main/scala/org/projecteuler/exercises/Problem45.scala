package org.projecteuler.exercises

object Problem45 {

  def isPentagonal(x: Long): Boolean = {
    ((math.sqrt(24 * x + 1) + 1) / 6).isWhole
  }

  def compute: Long = {
    var i: Long = 143;
    while (1 != 2) {
      i += 1;
      if (isPentagonal(i * (2 * i - 1))) {
        return i * (2 * i - 1)
      }
    }
    0
  }
}
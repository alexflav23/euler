package org.projecteuler.exercises

object Problem49 {
  def isPrime(x: Int): Boolean = {
    val end = math.sqrt(x).toInt
    for (i <- 2 to end) {
      if (x % i == 0) {
        return false
      }
    }
    true
  }

  def sameDigits(x: Int, y: Int, z: Int): Boolean = {
    val a = x.toString.sortWith(_ < _);
    val b = y.toString.sortWith(_ < _);
    val c = z.toString.sortWith(_ < _)
    (a == b) && (a == c)
  }

  def compute = {
    for (i <- 1001 to 9999 by 2; j <- (9999 - i) / 2 to 1 by -1) {
      if (isPrime(i) && isPrime(i + j) && isPrime(i + 2 * j) && sameDigits(i, i + j, i + 2 * j)) {
        println(i + "" + (i + j) + "" + (i + 2 * j))
      }
    }
  }

}
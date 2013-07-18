package org.projecteuler.exercises

object Problem12 {

  def countDivisors(x: Int): Int = {
    var divisors = 0;
    val end = Math.sqrt(x.toDouble).toInt
    for (i <- 1 to end) {
      if (x % i == 0) {
        divisors = divisors + 2;
      }
    }
    if (end * end == x)
      divisors - 1
    else
      divisors
  }

  def compute: Int = {
    var number = 0;
    var x = 1
    while (countDivisors(number) < 500) {
      number = number + x;
      x = x + 1
    }
    number
  }
}
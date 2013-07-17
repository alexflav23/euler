package org.projecteuler.exercises

object Problem27 {
  def isPrime(n: Int): Boolean = {
    var test = true;
    for (i <- 2 to math.sqrt(n).toInt) {
      if (n % i == 0)
        return false
    }
    if (n == 1) test = false
    test
  }

  def formula(n: Int, a: Int, b: Int): Int = {
    math.pow(n, 2).toInt + a * n + b
  }

  def compute: Int = {
    var max = 0;
    var r = 0;
    var s = 0;
    for (
      a <- -999 to 999;
      b <- -999 to 999
    ) {
      var n = 0;
      var count = 0;
      while (isPrime(formula(n, a, b))) {
        count += 1;
        n += 1;
      }
      if (count > max) {
        println(max)
        max = count;
        r = a; s = b;
      }
    }
    r * s
  }
}
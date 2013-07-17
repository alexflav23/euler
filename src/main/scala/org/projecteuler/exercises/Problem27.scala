package org.projecteuler.exercises

import scala.annotation.tailrec

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

  def produce(n: Int, a: Int, b: Int, count: Int): Int = {
    val exp = formula(n, a, b);
    if (exp > 0 && isPrime(exp)) {
      produce(n + 1, a, b, count + 1)
    } else {
      count
    }
  }

  def compute = {
    var max = 0;
    var r = 0;
    var s = 0;
    for (
      a <- -999 to 999;
      b <- -999 to 999
    ) {
      val x = produce(0, a, b, 0)
      if (x > max) {
        max = x;
        r = a; s = b;
      }
    }
    r * s
  }
}
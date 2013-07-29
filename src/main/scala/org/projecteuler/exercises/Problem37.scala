package org.projecteuler.exercises

import scala.annotation.tailrec;

object Problem37 {

  def isPrime(n: Int): Boolean = {
    val end = math.sqrt(n).toInt
    if (n > 1) {
      for (i <- 2 to end) {
        if (n % i == 0) return false;
      }
      true
    } else {
      false
    }
  }

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def rightToLeft(x: Int): Boolean = {
    var y = x;
    var len = y.toString.length;
    while (len > 1) {
      val c = y / math.pow(10, len - 1).toInt;
      if (!isPrime(c)) {
        return false;
      }
      len -= 1;
    }
    true
  }

  def leftToRight(x: Int): Boolean = {
    var y = x;
    var len = 1
    val limit = y.toString.length;
    while (len < limit) {
      val c = y % math.pow(10, len).toInt
      if (!isPrime(c)) {
        return false;
      }
      len += 1;
    }
    true
  }

  def compute(count: Int = 1, sum: Int = 0, primes: Stream[Int] = ps): Int = {
    if (count < 12) {
      if (primes.head > 10 && rightToLeft(primes.head) && leftToRight(primes.head)) {
        compute(count + 1, sum + primes.head, primes.tail)
      } else {
        compute(count, sum, primes.tail)
      }
    } else {
      sum
    }
  }

}
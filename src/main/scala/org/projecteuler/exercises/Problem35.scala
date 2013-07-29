package org.projecteuler.exercises

object Problem35 {
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def isPrime(n: Int): Boolean = {
    val end = math.sqrt(n).toInt
    for (i <- 2 to end) {
      if (n % i == 0) return false;
    }
    true
  }

  def isCircularPrime(n: Int): Boolean = {
    var y = n.toString;
    var count = 0;
    if (y.length > 1) {
      while (count < y.length - 1) {
        y = y.substring(1, y.length) + y(0);
        count += 1;
        if (!isPrime(y.toInt)) {
          return false;
        }
      }
      true
    } else {
      true
    }
  }

  val limit = 1000000;

  def compute(count: Int = 0, primes: Stream[Int] = ps): Int = {
    if (primes.head < limit) {
      if (isCircularPrime(primes.head)) {
        compute(count + 1, primes.tail)
      } else {
        compute(count, primes.tail)
      }
    } else {
      count
    }
  }

}

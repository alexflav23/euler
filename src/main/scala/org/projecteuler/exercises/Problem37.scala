package org.projecteuler.exercises

object Problem37 {

  def isPrime(n: Int): Boolean = {
    val end = math.sqrt(n).toInt
    for (i <- 2 to end) {
      if (n % i == 0) return false;
    }
    true
  }

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def rightToLeft(x: Int): Boolean = {
    var y = x;
    var len = y.toString.length;
    while (len > 0) {
      if (!isPrime(y % math.pow(10, len - 1).toInt)) {
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
    while (len <= limit) {
      if (!isPrime(y % math.pow(10, len).toInt)) {
        return false;
      }
      len += 1;
    }
    false
  }

  def compute() = {
    var count = 0;
    while (count < 12) {

    }
  }

}
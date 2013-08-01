package org.projecteuler.exercises

object Problem60 {

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

  def rightToLeft(x: Int): List[Int] = {
    var y = x;
    var l = List[Int]()
    var len = y.toString.length;
    while (len > 1) {
      val c = y / math.pow(10, len - 1).toInt;
      if (isPrime(c)) {
        l = c :: l
      }
      len -= 1;
    }
    l
  }

  def leftToRight(x: Int): List[Int] = {
    var y = x;
    var len = 1
    var l = List[Int]()
    val limit = y.toString.length;
    while (len < limit) {
      val c = y % math.pow(10, len).toInt
      if (isPrime(c)) {
        l = c :: l
      }
      len += 1;
    }
    l
  }

  def canCombine(l: Stream[Int]): Boolean = {
    println(l.mkString(" "))
    l.combinations(2) forall (pair => { isPrime(pair(0) * math.pow(10, pair(1).toString.length).toInt + pair(1)) })
  }

  def compute(primes: Stream[Int] = ps): Int = {
    ps combinations (5) foreach (combo => { if (canCombine(combo)) return combo.sum })
    0
  }
}
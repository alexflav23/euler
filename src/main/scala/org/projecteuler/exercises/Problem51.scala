package org.projecteuler.exercises

object Problem51 {
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def replacements(n: Int) = {

  }

  def compute = {
    var primes = ps dropWhile (_ < 1000000)

    for (i <- 1 to 8) {
      for (digit <- 1 to 9) {
        primes.head.toString.combinations(i)
      }
    }
  }
}
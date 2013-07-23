package org.projecteuler.exercises

object Problem50 {

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def compute(sum: Int = 0, max: Int = 0, primes: Stream[Int] = ps, terms: List[Int] = Nil): Int = {
    if (sum < 1000000) {
      val test = Problem46.isPrime(sum)
      println(sum + " " + terms.size)
      if (test == true) {
        compute(sum + primes.head, sum, primes.tail, primes.head :: terms)
      } else {
        compute(sum + primes.head, max, primes.tail, primes.head :: terms)
      }
    } else {
      max
    }
  }

}
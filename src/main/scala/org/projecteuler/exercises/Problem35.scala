package org.projecteuler.exercises

object Problem35 {

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def primesUnder(n: Int): List[Int] = {
    require(n >= 2)

    def rec(i: Int, primes: List[Int]): List[Int] = {
      if (i >= n) primes
      else if (prime(i, primes)) rec(i + 1, i :: primes)
      else rec(i + 1, primes)
    }

    rec(2, List()).reverse
  }

  def prime(num: Int, factors: List[Int]): Boolean = factors.forall(num % _ != 0)

  def compute: Int = {
    var count = 0;

    val sieve = primesUnder(1000000);
    val perms = Iterator
    sieve foreach (prime => {

    })

    count
  }

}
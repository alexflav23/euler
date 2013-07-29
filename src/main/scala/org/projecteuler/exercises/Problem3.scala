package org.projecteuler.exercises

object Problem3 {
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def compute: Int = {
    var primes = ps;
    var result = 0;
    var start: BigInt = BigInt("600851475143");
    while (start != 1) {
      if (start % primes.head == 0) {
        start /= primes.head;
        result = primes.head
      }
      primes = primes.tail;
    }
    result
  }
}
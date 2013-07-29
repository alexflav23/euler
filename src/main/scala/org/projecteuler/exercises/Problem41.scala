package org.projecteuler.exercises

import scala.annotation.tailrec;

object Problem41 {

  def isPandigital(x: String): Boolean = {
    val str = "123456789".substring(0, x.length);
    str forall (char => { x.count(char == _) == 1 })
  }

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  @tailrec
  def compute(max: Int = 0, primes: Stream[Int] = ps): Int = {
    if (max.toString.length < 8) {
      if (isPandigital(primes.head.toString)) {
        compute(primes.head, primes.tail)
      } else {
        compute(max, primes.tail)
      }
    } else {
      max
    }
  }
}
package org.projecteuler.exercises

import scala.collection.mutable.HashMap
object Problem47 {

  val dictionary: HashMap[Int, List[Int]] = new HashMap;

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def decompose(n: Int): List[Int] = {
    var x = n;
    var primes = ps;
    var factor = 1;
    var factors: List[Int] = List();
    while (x != 1) {
      while (x % primes.head == 0) {
        x /= primes.head;
        factor *= primes.head;
      }
      if (factor != 1) {
        factors = factor :: factors;
      }
      if (x == 1) {
        dictionary.put(n, factors)
        return factors
      }
      factor = 1;
      primes = primes.tail;
    }
    dictionary.put(n, factors)
    factors
  }

  def getFactors(n: Int): List[Int] = {
    dictionary.getOrElse(n, decompose(n))
  }

  def areDistinct(a: List[Int], b: List[Int], c: List[Int], d: List[Int]): Boolean = {
    (a ::: b ::: c ::: d).distinct.size >= 16
  }

  def compute: Int = {
    println(decompose(15))
    println(decompose(17))
    var c = 10;
    while (1 != 2) {
      if (areDistinct(getFactors(c), getFactors(c + 1), getFactors(c + 2), getFactors(c + 3))) {
        return c;
      }
      c += 1;
    }
    0;
  }

}
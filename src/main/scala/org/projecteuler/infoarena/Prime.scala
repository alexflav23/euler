package org.projecteuler.infoarena

object Prime {
  def main(args: Array[String]) {
    var t = System.currentTimeMillis;

    var result = getResult(1000000)

    var took = System.currentTimeMillis - t;

    println("result: " + result)
    println("time: " + took + " ms.")
  }

  // get Sieve of Eratosthenes
  def getSieve(limit: Int): Array[Int] = {
    var i = 2
    var primes = new Array[Int](limit + 1)

    primes(0) = 1
    primes(1) = 1
    while (i * i <= limit) {
      if (primes(i) == 0) {
        var k = i * i
        while (k <= limit) {
          primes(k) = 1
          k += i
        }
      }
      i += 1
    }
    return primes;
  }

  // calc sums
  def getPrimeSum(primes: Array[Int], limit: Int): Array[Int] = {
    var i = 0
    var k = 1
    var primeSum = new Array[Int](limit + 1)
    primeSum(0) = 0
    while (i <= limit) {
      if (primes(i) == 0) {
        primeSum(k) = primeSum(k - 1) + i
        k += 1
      }
      i += 1
    }
    return primeSum
  }

  // calc the result
  def getResult(limit: Int): Int = {
    var found = 0;
    var result = 0;
    var numberOfPrimes = 0;

    var primes = getSieve(limit);

    var primeSum = getPrimeSum(primes, limit);

    var i = 0
    while (i <= limit) {
      var j = i - (numberOfPrimes + 1)
      while (j >= 0) {
        if (primeSum(i) - primeSum(j) > limit) {
          found = 1;
          return result;
        }

        var p = primeSum(i) - primeSum(j);
        if (p > 0 && primes(p) == 0) {
          numberOfPrimes = i - j;
          result = primeSum(i) - primeSum(j);
        }
        j -= 1
      }
      i += 1
    }
    return result;
  }
}
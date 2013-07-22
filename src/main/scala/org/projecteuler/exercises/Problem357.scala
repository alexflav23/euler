package org.projecteuler.exercises

object Problem357 {

  def isPrime(x: Int): Boolean = {
    val end = math.sqrt(x).toInt
    for (i <- 2 to end) {
      if (x % i == 0) {
        return false
      }
    }
    true
  }

  def generatesPrimes(x: Int): Boolean = {
    val end = math.sqrt(x).toInt;
    for (i <- 1 to end) {
      if (x % i == 0) {
        if (!isPrime(x + x / i)) {
          return false;
        }
      }
    }
    true
  }

  def compute = {
    var sum = BigInt(0)
    for (i <- 1 to 100000000) {
      if (generatesPrimes(i))
        sum += i
    }
    println(sum)
  }
}
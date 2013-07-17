package org.projecteuler.exercises

object Problem46 {
  def isComposite(n: Int): Boolean = {
    var test = false;
    for (i <- 2 to math.sqrt(n).toInt) {
      if (n % i == 0)
        test = true
    }
    test
  }

  def isPrime(n: Int): Boolean = {
    var test = true;
    for (i <- 2 to math.sqrt(n).toInt) {
      if (n % i == 0)
        return false
    }
    if (n == 1) test = false
    test
  }

  def isConjecture(x: Int): Boolean = {
    for (i <- 1 to x) {
      if (isSquare(math.sqrt((x - i) / 2)) && isPrime(i)) {
        return true;
      }
    }
    false
  }

  def isSquare(x: Double): Boolean = {
    x == x.toInt
  }

  def compute(i: Int = 1): Int = {
    if (isComposite(i) && !isConjecture(i)) {
      i
    } else
      compute(i + 2)
  }
}
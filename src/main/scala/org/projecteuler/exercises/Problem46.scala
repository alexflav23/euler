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
        test = false
    }
    if (n == 1) test = false
    test
  }

  def isConjecture(x: Int): Boolean = {
    for (i <- 1 to x) {
      val j = x - i
      if (isSquare(j / 2) && isPrime(i)) {
        val z = math.sqrt(j / 2).toInt
        //println(s"$x = 2 * $z\u00B2  + $i")
        return true;
      }
    }
    false
  }

  def isSquare(x: Int): Boolean = {
    val z = math.sqrt(x).toInt
    z * z == x
  }

  def compute: Int = {
    for (i <- 1 to 10000 by 2) {
      if (isComposite(i) && !isConjecture(i)) {
        return i
      }
    }
    0
  }
}
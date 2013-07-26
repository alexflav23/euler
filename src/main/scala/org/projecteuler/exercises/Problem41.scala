package org.projecteuler.exercises

object Problem41 {

  def isPandigital(x: String): Boolean = {
    val str = "123456789".substring(0, x.length);
    str forall (char => { x.count(char == _) == 1 })
  }

  def isPrime(n: Int): Boolean = {
    val end = math.sqrt(n).toInt
    for (i <- 2 to end) {
      if (n % i == 0) return false;
    }
    true
  }

  def compute: Int = {
    val limit = 999999999;
    for (num <- limit to 0 by -2) {
      if (num % 10 != 5 && isPandigital(num.toString) && isPrime(num)) {
        return num;
      }
    }
    0;
  }
}
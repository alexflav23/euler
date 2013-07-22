package org.projecteuler.exercises

object Problem34 {

  def factorial(n: Int, res: BigInt): BigInt = {
    if (n > 0)
      factorial(n - 1, res * n)
    else
      res
  }

  def sumFactorials(x: Int): BigInt = {
    var sum = BigInt(0);
    x.toString foreach (char => { sum += factorial(char.asDigit, 1) })
    sum
  }

  def compute: BigInt = {
    var sum = BigInt(0);
    for (i <- 100 to 50000) {
      if (sumFactorials(i) == i) {
        println(i)
        sum += i
      }
    }
    sum
  }
}
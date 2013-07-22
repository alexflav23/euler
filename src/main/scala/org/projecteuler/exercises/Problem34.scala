package org.projecteuler.exercises

import scala.annotation.tailrec

object Problem34 {

  @tailrec
  def factorial(n: Int, res: Int): Int = {
    if (n == 0)
      res
    else
      factorial(n - 1, res * n)
  }

  def sumFactorials(x: Int): Int = {
    var sum = 0;
    x.toString foreach (char => { sum += factorial(char.asDigit, 1) })
    sum
  }

  def compute: BigInt = {
    var sum = 0;
    for (i <- 100 to 50000) {
      if (sumFactorials(i) == i) {
        sum += i
      }
    }
    sum
  }
}
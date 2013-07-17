package org.projecteuler.exercises

import java.math.BigInteger

object SumOfFactorialDigits {
  var x = BigInt("1")
  def factorial: Int = {
    for (i <- 2 to 100) {
      x *= i
    }
    var sum = 0;
    x.toString.toList.foreach(sum += _.asDigit)
    println(sum)
    sum
  }
}
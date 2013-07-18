package org.projecteuler.exercises

object Problem20 {

  def compute: Int = {
    var x = BigInt(1)
    for (i <- 2 to 100) {
      x *= i
    }
    var sum = 0;
    x.toString.foreach(sum += _.asDigit)
    sum
  }
}
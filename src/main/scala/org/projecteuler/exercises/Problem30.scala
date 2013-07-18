package org.projecteuler.exercises

object Problem30 {

  def power(num: Int, sum: Double = 0): Double = {
    if (num > 0)
      power(num / 10, sum + math.pow(num % 10, 5))
    else {
      sum
    }
  }

  def compute: Int = {
    var total = 0
    var i = 4000
    while (i < 198000) {
      if (i == power(i)) {
        total += i
      }
      i += 1
    }
    total
  }
}
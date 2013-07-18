package org.projecteuler.exercises

object Problem36 {
  def isPalindrom(num: String): Boolean = {
    num.length % 2 match {
      case 0 =>
        num.substring(0, num.length / 2) ==
          num.substring(num.length / 2, num.length).reverse;
      case 1 =>
        num.substring(0, (num.length - 1) / 2) ==
          num.substring((num.length - 1) / 2 + 1, num.length).reverse;
    }
  }

  def compute: Int = {
    var sum = 0;
    for (i <- 1 to 1000000) {
      if (isPalindrom(i.toString) && isPalindrom(i.toBinaryString)) {
        sum += i
      }
    }
    sum
  }
}
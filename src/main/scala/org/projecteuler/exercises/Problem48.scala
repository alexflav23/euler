package org.projecteuler.exercises

object Problem48 {
  def lastDigit(x: Int): Int = {
    val cif = x % 10;

    cif match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case 3 => 9
      case 4 => 16
      case 5 => 25
      case 6 => 36
      case 7 => 49
      case 8 => 64
      case 9 => 81
    }
  }

  def compute: Int = {
    var result = 0;
    var modulo: Int = 1000000
    for (i <- 1 to 1000) {
      var temp = i;
      for (j <- 1 to i) {
        temp *= i
        temp %= modulo;
      }
      result += temp;
      result %= modulo
    }
    result
  }
}
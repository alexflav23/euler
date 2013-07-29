package org.projecteuler.exercises

object Problem9 {

  def compute: Int = {
    for (a <- 1 to 1000; b <- 1 until a) {
      val c = 1000 - a - b;
      if (math.pow(c, 2) == math.pow(a, 2) + math.pow(b, 2) && (a + b + c == 1000)) {
        return a * b * c;
      }
    }
    1
  }
}
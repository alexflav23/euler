package org.projecteuler.exercises

object Problem4 {

  def compute: Int = {
    var max = 0;
    for (i <- 990 to 100 by -11; j <- 999 to 100 by -1) {
      val res = i * j;
      if (res.toString == res.toString.reverse && res > max) {
        max = res;
      }
    }
    max
  }
}
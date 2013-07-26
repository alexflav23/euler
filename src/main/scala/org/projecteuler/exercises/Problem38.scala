package org.projecteuler.exercises

object Problem38 {

  def isPandigital(x: String): Boolean = {
    if (x.length != 9) return false
    "123456789" foreach (char => { if (x.count(char == _) != 1) return false })

    true;
  }

  def compute: Int = {

    var max = 0;
    for (i <- 1 to 1000; j <- 1 to 1000) {
      val res = i * j;
      if (isPandigital(i.toString.concat(j.toString).concat(res.toString)) && res > max) {
        max = res;
      }
    }
    max
  }
}
package org.projecteuler.exercises

object Problem38 {

  def isPandigital(x: String): Boolean = {
    if (x.length != 9) return false
    "123456789" foreach (char => { if (x.count(char == _) != 1) return false })

    true;
  }

  def pandigitialSeq(n: Int): String = {
    var str = "";
    var output = "";
    for (j <- 1 to n) {
      val res = n * j;
      if (str.length() > 9) {
        return output;
      }
      str = str.concat(res.toString);
      if (isPandigital(str)) {
        output = str;
      }
    }
    output;
  }

  def compute: Int = {

    var max = 0;
    for (i <- 1 to 10000) {
      val str = pandigitialSeq(i);
      if (str.length() > 0) {
        val res = str.toInt;
        if (res > max) {
          max = res;
        }
      }
    }
    max;
  }
}
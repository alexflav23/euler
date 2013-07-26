package org.projecteuler.exercises

object Problem38 {

  def isPandigital(x: String): Boolean = {
    "123456789" forall (char => { x.count(char == _) == 1 })
  }

  def pandigitialSeq(n: Int): String = {
    var str = "";
    var output = "";
    for (j <- 1 to n) {
      val res = n * j;
      str = str.concat(res.toString);
      if (str.length() > 9) {
        return output;
      } else {
        if (str.length() == 9 && isPandigital(str)) {
          return str;
        }
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
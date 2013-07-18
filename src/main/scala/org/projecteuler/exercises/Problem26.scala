package org.projecteuler.exercises

object Problem26 {

  def compute: Int = {
    var seqLength = 0;
    var origin = 0;
    for (i <- 1000 to 1 by -1) {
      if (seqLength < i) {
        val remainders: Array[Int] = new Array(i);
        var value = 1;
        var pos = 0;
        while (remainders(value) == 0 && value != 0) {
          remainders(value) = pos;
          value *= 10;
          value %= i;
          pos += 1
        }
        if (pos - remainders(value) > seqLength) {
          seqLength = pos - remainders(value)
          origin = i
        }
      }
    }
    origin
  }

}
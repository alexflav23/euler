package org.projecteuler.exercises

object Problem2 {

  val limit = 4000000;
  def compute(a: Int = 0, b: Int = 1, sum: Int = 0): Int = {
    if (a < limit) {
      if ((a + b) % 2 == 0) {
        compute(b, a + b, sum + a + b);
      } else {
        compute(b, a + b, sum);
      }
    } else {
      sum;
    }
  }

}
package org.projecteuler.exercises

object Problem6 {
  def compute: Int = {
    val n = 100;
    math.pow(n * (n + 1) / 2, 2).toInt - n * (2 * n + 1) * (n + 1) / 6
  }
}
package org.projecteuler.infoarena

import scala.collection.mutable.HashMap;

object StirlingNumbers {
  //s(n,m) = s(n-1,m-1) - (n-1)*s(n-1,m)  şi  S(n,m) = S(n-1,m-1) + m*S(n-1,m) .

  val cache: HashMap[Tuple2[Int, Int], BigInt] = new HashMap
  def stirling(n: Int, m: Int): BigInt = {
    if (m == 1 || n == m || m == 0) {
      1
    } else if (m == 2) {
      BigInt(2).pow(n - 1) - 1
    } else if (m == 3) {
      (BigInt(3).pow(n) - 3 * BigInt(2).pow(n) + 3) / 6
    } else {
      stirling(n - 1, m - 1) + m * stirling(n - 1, m)
    }
  }

  def compute: BigInt = {
    stirling(10, 5)
  }
}
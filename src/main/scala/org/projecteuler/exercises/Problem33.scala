package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer;

object Problem33 {

  def canSimplyTo(a: Int, b: Int, x: Int, y: Int): Boolean = {

    val end = math.min(a, b)

    for (div <- 2 to end) {

    }
    false;
  }

  def gcd(a: Int, b: Int): Int = {
    var x = a;
    var y = b;
    while (x != y) {
      if (x > y) {
        x = x - y
      } else {
        y = y - x
      }
    }
    x
  }
  def compute: Int = {
    var den = 1;
    var nom = 1;
    for (a <- 10 to 99; b <- 10 until a) {
      val c1 = a % 10;
      val c2 = b % 10;
      val cc1 = a / 10
      val cc2 = b / 10

      if (c1 != 0 && c2 != 0) {
        if (cc1 == c2) {
          if (a * cc2 == b * c1) {
            den *= a;
            nom *= b;
          }
        }

        if (c1 == cc2) {
          if (a * c2 == b * cc1) {
            den *= a;
            nom *= b;
          }
        }

      }
    }
    den / gcd(den, nom)
  }
}
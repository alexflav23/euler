package org.projecteuler.exercises

import scala.collection.mutable.HashMap

object Problem39 {

  val results: HashMap[Int, Int] = new HashMap;
  def triplet(a: Int, b: Int, c: Int): Boolean = math.pow(c, 2) == math.pow(b, 2) + math.pow(a, 2)

  def compute: Int = {
    var max = 0;
    for (p <- 12 to 1000) {
      var count = 0;
      for (c <- 1 to p; a <- 1 until p - c) {
        val b = p - c - a;
        if ((a + b + c == p) && triplet(a, b, c)) {
          count += 1;
        }
      }
      if (count > max) max = p;
    }
    max
  }
}
package org.projecteuler.exercises

import scala.collection.mutable.HashMap

object Problem39 {

  val results: HashMap[Int, Int] = new HashMap;
  def triplet(a: Int, b: Int, c: Int): Boolean = math.pow(c, 2) == math.pow(b, 2) + math.pow(a, 2)

  def compute: Int = {

    for (p <- 1 to 1000; c <- 1 to p; a <- 1 to p - c) {
      val b = c - a;
      //println(s"$a + $b + $c = $p")
      if (triplet(a, b, c)) {
        results.put(c, 0);
        results.update(c, results.get(c).get + 1);
      }
    }
    results.maxBy(_._2)._2;
  }
}
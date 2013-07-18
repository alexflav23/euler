package org.projecteuler.exercises

import scala.collection.mutable.HashMap;

object Problem29 {
  def compute: Int = {
    val results: HashMap[BigInt, Int] = new HashMap
    for (a <- 2 to 100; b <- 2 to 100) {
      results.put(BigInt(a).pow(b), 0)
    }
    results.size
  }
}
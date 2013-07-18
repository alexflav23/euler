package org.projecteuler.exercises

import scala.collection.mutable.HashMap
import scala.collection.immutable.Range;

object Problem23 {
  val limit = 28123

  val map: HashMap[Int, Int] = new HashMap

  def sumOfDivisors(x: Int): Int = {
    var sum = 0
    for (i <- 1 to x / 2) {
      if (x % i == 0) {
        sum += i
      }
    }
    sum
  }

  def sumDiv(x: Int): Int = {
    Range(1, x / 2 + 1, 1).filter(x % _ == 0).sum
  }

  def compute: BigInt = {
    var sum = BigInt(0);
    for (i <- 12 to limit) {
      if (sumOfDivisors(i) > i) map.put(i, i)
    }
    var test = false;
    for (i <- 1 to limit) {
      for ((key, value) <- map) {
        if (i > value && map.get(i - value) != None) {
          test = true
        }
      }
      if (!test) sum += i
      test = false
    }
    println(sum)
    sum
  }
}
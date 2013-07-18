package org.projecteuler.exercises

import scala.annotation.tailrec;
import scala.collection.mutable.HashMap;

object Problem14 {

  val map: HashMap[BigInt, BigInt] = new HashMap
  val limit = 1000000

  def rec(x: BigInt, count: BigInt = 1, original: BigInt): BigInt = {
    if (x == 1) {
      map.put(original, count)
      count
    } else {
      map.get(x) match {
        case Some(data) =>
          map.put(original, count + data - 1)
          count + data - 1
        case None => (x % 2).toInt match {
          case 0 => rec(x / 2, count + 1, original)
          case 1 => rec(3 * x + 1, count + 1, original)
        }
      }
    }
  }

  def compute = {
    var max: BigInt = 0;
    var number: BigInt = 0;
    for (i <- 2 to limit) {
      val c = rec(i, 1, i);
      if (c > max) {
        number = i;
        max = c
      }
    }
    println(s"$number -> $max")
  }
}
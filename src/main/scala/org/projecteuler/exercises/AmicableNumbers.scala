package org.projecteuler.exercises

import scala.collection.mutable.HashMap;

object AmicableNumbers {

  val map: HashMap[Int, Int] = new HashMap

  def countDivisors(x: Int): Tuple2[Int, Int] = {
    var div = 0
    var sum = 0
    for (i <- 1 to x / 2) {
      if (x % i == 0) {
        div += 1
        sum += i
      }
    }
    (div, sum)
  }

  def amicableNumbers = {
    var total = 0;
    for (i <- 1 to 10000) {
      val sum = countDivisors(i)._2
      val amicable = countDivisors(countDivisors(i)._2)._2
      if (amicable == i && map.get(sum) == None && i != sum) {
        map.put(i, sum)
      }
    }
    map.foreach { case (key, value) => total += key + value }
    println(total)
  }

}
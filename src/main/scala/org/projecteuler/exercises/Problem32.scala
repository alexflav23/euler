package org.projecteuler.exercises

import scala.collection.mutable.HashMap

object Problem32 {

  val products: HashMap[Int, Tuple2[Int, Int]] = new HashMap;

  def isPandigital(x: String): Boolean = {
    "123456789".foreach(char => { if (x.count(_ == char) != 1) return false })
    true
  }

  def glue(x: Int, y: Int, z: Int): String = {
    x.toString.concat(y.toString.concat(z.toString))
  }

  def compute: Int = {
    var sum = 0;
    for (i <- 1 until 2000; j <- 1 until 2000) {
      val str = glue(i, j, i * j)
      if (str.length == 9 && isPandigital(str)) {
        val res = i * j
        if (products.get(res) == None) {
          products.put(res, (i, j));
          println(s"$i * $j = $res")
          sum += res;
        }
      }
    }
    sum
  }
}
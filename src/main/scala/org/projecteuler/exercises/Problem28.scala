package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer

object Problem28 {

  def spiral(n: Int) = {
    val sp: Array[Array[Int]] = new Array(n)
    for (i <- 0 until n) {
      sp(i) = new Array(n)
    }
    var current = 1
    var x = n / 2 - 1
    var y = n / 2 - 1
    var order = 1

    for (order <- 1 to n) {
      println(s"$order   -------------")
      for (i <- 1 until order) {
        println(s"x: $x y: $y curr: $current")
        sp(x)(y) = current
        y += 1
        current += 1
      }
    }

    sp.foreach(line => {
      if (line != null) {
        println(line.mkString(" "))
      }
    })
  }

  def next(dir: Int): Int = {
    dir match {
      case 3 => 0
      case _ => dir + 1
    }
  }

  def compute = {
    spiral(3)
  }
}
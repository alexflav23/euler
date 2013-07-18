package org.projecteuler.run

import org.projecteuler.exercises._;

object Main extends App {

  override def main(args: Array[String]) {
    //LargetProductInAGrid.max
    val s = System.nanoTime

    //FibonacciNumber.compute
    Problem28.compute

    val f = System.nanoTime
    println("Solution took " + (f - s) / 1000000.0 + " miliseconds")
  }
}

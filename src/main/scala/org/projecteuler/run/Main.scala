package org.projecteuler.run

import org.projecteuler.exercises._;

object Main extends App {

  override def main(args: Array[String]) {
    //LargetProductInAGrid.max
    val s = System.nanoTime

    //FibonacciNumber.compute
    println(Problem27.compute)

    val f = System.nanoTime
    println((f - s) / 1000000000.0 + " seconds")
  }
}

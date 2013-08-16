package org.projecteuler.run

import org.projecteuler.exercises._;
import org.projecteuler.infoarena._;

object Main extends App {

  def timed[T](exec: => T) = {
    val s = System.nanoTime
    val result = exec
    println("Result: " + result)
    val f = System.nanoTime
    println("Solution took " + (f - s) / 1000000 + " miliseconds")
  }
  override def main(args: Array[String]) {

    timed[Unit] {
      Prime.getResult(1000000)
    }
  }
}

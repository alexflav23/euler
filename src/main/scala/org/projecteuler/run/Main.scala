package org.projecteuler.run

import org.projecteuler.exercises._;
import org.projecteuler.infoarena._;
import scala.collection.mutable.ArrayBuffer;

object Main extends App {

  override def main(args: Array[String]) {

    val s = System.nanoTime
    println("Result: " + Problem34.compute)
    val f = System.nanoTime

    println("Solution took " + (f - s) / 1000000 + " miliseconds")
  }
}

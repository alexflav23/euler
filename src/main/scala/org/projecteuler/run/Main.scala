package org.projecteuler.run

import org.projecteuler.exercises._;
import org.projecteuler.infoarena._;
import scala.collection.mutable.ArrayBuffer;

object Main extends App {

  override def main(args: Array[String]) {

    val s = System.nanoTime
    println("Result: " + Problem24.compute)
    val f = System.nanoTime

    println("Solution took " + (f - s) / 1000000 + " miliseconds")

    val str = ",,,,hello,,,,"
    val str2 = ",,,,hello,,,,  "

    def trim(str: String): String = {
      str.replaceAll("""[\s,]""", "");
    }

    def trimLeft(str: String): String = {
      str.replaceAll("""^[\s,]+""", "")
    }

    def trimRight(str: String): String = {
      str.replaceAll("""[\s,]+$""", "")
    }

    println("Left: " + trimLeft(str2));
    println("Right: " + trimRight(str));

  }
}

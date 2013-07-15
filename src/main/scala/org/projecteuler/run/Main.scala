package org.projecteuler.run

import _root_.java.util.concurrent.TimeUnit;
import org.projecteuler.exercises._;

object Main extends App {

  override def main(args: Array[String]) {
    //LargetProductInAGrid.max
    val s = System.nanoTime
    LargestCollatzSeq.largestSeq
    val f = System.nanoTime
    println((f - s) / 1000000000.0)
  }

}
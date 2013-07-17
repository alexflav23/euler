package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer;
import scala.annotation.tailrec;

object FibonacciNumber {

  @tailrec
  def fib(a: BigInt, b: BigInt, index: Int, stop: Int): BigInt = {
    if (b.toString.length == stop) {
      println(index)
      b
    } else {
      fib(b, a + b, index + 1, stop)
    }
  }

  def compute = {
    val fn = fib(BigInt(1), BigInt(1), 2, 1000)
  }
}
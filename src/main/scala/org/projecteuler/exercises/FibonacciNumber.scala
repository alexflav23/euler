package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer;

object FibonacciNumber {

  def sum(a: ListBuffer[Int], b: ListBuffer[Int]): ListBuffer[Int] = {
    val result: ListBuffer[Int] = new ListBuffer;
    var carry = 0;

    if (a.length < b.length) {
      var diff = b.length - a.length;
      while (diff > 0) {
        0 +=: a;
        diff = diff - 1;
      }
    } else if (b.length < a.length) {
      var diff = a.length - b.length;
      while (diff > 0) {
        0 +=: b;
        diff = diff - 1;
      }
    }

    val end: Int = math.min(a.length, b.length) - 1
    for (i <- end to 0 by -1) {
      val c: Int = a(i) + b(i) + carry;
      if (c >= 10) {
        carry = 1;
        (c % 10) +=: result
      } else {
        carry = 0
        c +=: result
      }
    }
    if (carry > 0) {
      1 +=: result
      carry = 0
    }
    result
  }

  def fib(a: ListBuffer[Int], b: ListBuffer[Int], index: Int, stop: Int): ListBuffer[Int] = {
    if (b.length < stop) {
      fib(b, sum(a, b), index + 1, stop)
    } else {
      println(index)
      b
    }
  }

  def compute = {
    var a: ListBuffer[Int] = new ListBuffer
    a += 1;

    var b: ListBuffer[Int] = new ListBuffer
    b += 1;

    val fn = fib(a, b, 2, 1000)

  }
}
package org.projecteuler.exercises
import scala.io.Source;
import scala.collection.mutable.ListBuffer;

object LargeNumberSum {

  val numbers = Source.fromFile("numbers.in").getLines.toList.to[ListBuffer];

  def convert(list: ListBuffer[Char]): ListBuffer[Int] = {
    for (char <- list) yield char.asDigit;
  }

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

  def product(y: Int): ListBuffer[Int] = {
    var c: ListBuffer[Int] = new ListBuffer
    c += 2
    for (i <- 1 to y) {
      c = sum(c, c)
    }
    c
  }

  def test = {
    var c = convert(numbers(0).toList.to[ListBuffer])
    for (i <- 1 to numbers.length - 1) {
      c = sum(c, convert(numbers(i).toList.to[ListBuffer]))
    }

  }
}
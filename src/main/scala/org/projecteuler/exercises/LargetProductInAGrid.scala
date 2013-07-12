package org.projecteuler.exercises

import scala.io._;
import scala.collection.mutable.ListBuffer;

object LargetProductInAGrid {

  val data: ListBuffer[ListBuffer[Int]] = new ListBuffer;
  def read = {
    Source.fromFile("grid.in").getLines.foreach(line => {
      val numbers: ListBuffer[Int] = new ListBuffer;

      line.split(""" """).foreach(number => {
        numbers += number.toInt;
      })
      data += numbers
    })

    data.foreach(line => {
      println(line(0))
    })
  }

  def max: Int = {
    read;
    0
  }

  def up(x: Int, y: Int): Int = {
    if (x + 4 < data.length) {
      data(x)(y) + data(x + 1)(y) + data(x + 2)(y) + data(x + 3)(y)
    } else {
      0
    }
  }

  def down(x: Int, y: Int): Int = {
    if (x - 4 >= 0) {
      data(x)(y) + data(x - 1)(y) + data(x - 2)(y) + data(x - 3)(y)
    } else {
      0
    }
  }

  def left(x: Int, y: Int): Int = {
    if (y - 4 >= 0) {
      data(x)(y) + data(x)(y - 1) + data(x)(y - 3) + data(x)(y - 4)
    } else {
      0
    }
  }

  def right(x: Int, y: Int): Int = {
    if (y + 4 < data(0).length) {
      data(x)(y) + data(x)(y + 1) + data(x)(y + 3) + data(x)(y + 4)
    } else {
      0
    }
  }

}
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
    var max = 0;
    for {
      x <- List.range(0, data.length);
      y <- List.range(0, data.length)
    } {
      val list = up(x, y) :: down(x, y) :: left(x, y) :: right(x, y) :: upRight(x, y) :: upLeft(x, y) :: downLeft(x, y) :: downRight(x, y) :: Nil
      if (list.max > max) max = list.max
    }
    println(max)
  }

  def max: Int = {
    read;
    0
  }

  def up(x: Int, y: Int): Int = {
    if (x + 4 < data.length) {
      data(x)(y) * data(x + 1)(y) * data(x + 2)(y) * data(x + 3)(y)
    } else {
      0
    }
  }

  def down(x: Int, y: Int): Int = {
    if (x - 4 >= 0) {
      data(x)(y) * data(x - 1)(y) * data(x - 2)(y) * data(x - 3)(y)
    } else {
      0
    }
  }

  def left(x: Int, y: Int): Int = {
    if (y - 4 >= 0) {
      data(x)(y) * data(x)(y - 1) * data(x)(y - 3) * data(x)(y - 4)
    } else {
      0
    }
  }

  def right(x: Int, y: Int): Int = {
    if (y + 4 < data(0).length) {
      data(x)(y) * data(x)(y + 1) * data(x)(y + 3) * data(x)(y + 4)
    } else {
      0
    }
  }

  def upRight(x: Int, y: Int): Int = {
    if (y + 4 < data(0).length && x + 4 < data(0).length) {
      data(x)(y) * data(x + 1)(y + 1) * data(x + 2)(y + 2) * data(x + 3)(y + 3)
    } else {
      0
    }
  }

  def upLeft(x: Int, y: Int): Int = {
    if (y - 4 >= 0 && x + 4 < data(0).length) {
      data(x)(y) * data(x + 1)(y - 1) * data(x + 2)(y - 2) * data(x + 3)(y - 3)
    } else {
      0
    }
  }

  def downLeft(x: Int, y: Int): Int = {
    if (y - 4 > 0 && x - 4 > 0) {
      data(x)(y) * data(x - 1)(y - 1) * data(x - 2)(y - 2) * data(x - 3)(y - 3)
    } else {
      0
    }
  }

  def downRight(x: Int, y: Int): Int = {
    if (y + 4 < data(0).length && x - 4 > 0) {
      data(x)(y) * data(x - 1)(y + 1) * data(x - 2)(y + 2) * data(x - 3)(y + 3)
    } else {
      0
    }
  }

}
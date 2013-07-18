package org.projecteuler.exercises
import scala.io.Source;
import scala.collection.mutable.ListBuffer;

object Problem13 {

  def compute: String = {
    var c = BigInt(0)
    Source.fromFile("numbers.in").getLines.foreach(number => {
      c += BigInt(number)
    })
    c.toString
  }
}
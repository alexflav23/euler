package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer
import scala.io._

object Problem18 {

  val triangle: ListBuffer[ListBuffer[Int]] = new ListBuffer

  def dynamic: Int = {
    Source.fromFile("triangle.in").getLines.foreach(triangle += _.split("""\s+""").map(_.toInt).toList.to[ListBuffer])
    for (i <- triangle.length - 2 to 0 by -1; j <- 0 to i) {
      triangle(i)(j) += math.max(triangle(i + 1)(j), triangle(i + 1)(j + 1))
    }
    triangle(0)(0)
  }

}

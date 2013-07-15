package org.projecteuler.exercises

import scala.collection.mutable.ListBuffer
import scala.io._

object MaximumSumPath {

  val triangle: ListBuffer[ListBuffer[String]] = new ListBuffer
  val lines = Source.fromFile("triangle.in").getLines.toList

  def read = {
    lines.foreach(line => {
      triangle += line.split(""" """).toList.to[ListBuffer]
    })
    triangle.foreach(line => {
      println(line.mkString(" "))
    })
  }
}
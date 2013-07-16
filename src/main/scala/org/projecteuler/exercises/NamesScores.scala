package org.projecteuler.exercises

import scala.io.Source;

object NamesScores {

  def getNameScore(name: String): Int = {
    var sum = 0
    name.toLowerCase.foreach(sum += _.toInt - 96)
    sum
  }

  def read = {
    println(getNameScore("COLIN"))
    val numbers = Source.fromFile("names.in").getLines.toList;
    val names = numbers(0).split(""",""").map(name => { name.substring(1, name.length - 1) }).sortWith(_ < _)

    var sum = 0;
    for (i <- 0 to names.length - 1) {
      sum += getNameScore(names(i) * (i + 1))
    }

    println(sum)
  }
}
package org.projecteuler.exercises

import scala.io.Source;
import scala.collection.mutable.ListBuffer;

object Problem42 {
  val words = Source.fromFile("words.txt").mkString.split("""[\",\"]""") dropWhile (_.matches("""\s"""))
  val wordList: ListBuffer[String] = new ListBuffer();

  def getWordValue(word: String): Int = {
    var sum = 0;
    word foreach (char => { sum += char.toLower - 96 })
    sum;
  }

  def isTriangular(x: Int): Boolean = {
    val sq = math.sqrt(8 * x + 1)
    sq == sq.toInt && x != 0
  }

  def compute: Int = {
    words.filter(word => { isTriangular(getWordValue(word)) }).size
  }
}
package org.projecteuler.exercises
import scala.io.Source;
import scala.collection.mutable.ListBuffer;

object LargeNumberSum {

    implicit def charToInt(x: Char) = x.asDigit;

    implicit def intListToChar(x: ListBuffer[Int]): ListBuffer[Char] =
        for (c <- x) yield c.toChar

    val numbers = Source.fromFile("numbers.in").getLines.toList;

    def sum(a: ListBuffer[Char], b: ListBuffer[Char]): ListBuffer[Char] = {
        val result: ListBuffer[Int] = new ListBuffer;
        var carry = 0;
        for (i <- a.length - 1 to 0 by -1) {
            //+=:
            val c = a(i) + b(i) + carry;
            if (c >= 10) {
                carry = 1;
                (c % 10) +=: result
            } else {
                carry = 0
                c +=: result
            }
        }
        if (carry > 0) {
            1.toChar +=: result
        }
        println(result)
        result
    }

    def test = {
        println(sum("123".toList.to[ListBuffer], "8923".toList.to[ListBuffer]));
        var c: ListBuffer[Char] = new ListBuffer;
        for (i <- 1 to numbers.length - 2) {
            c = sum(numbers(i).toList.to[ListBuffer], numbers(i + 1).toList.to[ListBuffer])
        }
    }
}
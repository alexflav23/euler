package org.projecteuler.exercises

object Problem16 {

  def compute: Int = {
    var sum = 0;
    BigInt(2).pow(1000).toString.foreach(sum += _.asDigit)
    sum
  }
}
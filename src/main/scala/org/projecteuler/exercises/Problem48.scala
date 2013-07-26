package org.projecteuler.exercises

object Problem48 {
  def compute: BigInt = {
    var result = BigInt(0);
    val modulo: BigInt = BigInt("10000000000")
    for (i <- 1 to 1000) {
      result += BigInt(i).pow(i) % modulo
    }
    result % modulo
  }
}
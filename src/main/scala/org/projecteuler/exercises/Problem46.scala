package org.projecteuler.exercises

object Problem46 {
  def isComposite(n: Int): Boolean = {
    for (i <- 2 to math.sqrt(n).toInt) {
      if (n % i == 0)
        return true
    }
    false
  }

  def hasSquare(x: Int): Boolean = {
    for (i <- 1 to x; j <- 1 to x) {
      if (isSquare(j / 2))
        return true;
    }
    false
  }

  def isSquare(x: Int) = {
    (x & 0xF).toInt match {
      case 0 => math.pow(math.sqrt(x).toInt, 2) == x
      case 1 => math.pow(math.sqrt(x).toInt, 2) == x
      case 4 => math.pow(math.sqrt(x).toInt, 2) == x
      case 9 => math.pow(math.sqrt(x).toInt, 2) == x
      case _ => false
    }
  }

  def isConjecture(x: Int): Boolean = {
    hasSquare(x)
  }

  def compute: Int = {
    //for (i <- 1 to 27) { if (i % 2 == 1) println(i + ": " + isComposite(i)) }
    var i = 27;
    var test = true;
    while (test == true) {
      if (isComposite(i)) {
        test = hasSquare(i)
        println(i)
        println(test)
      }
      i += 2
    }
    i
  }
}
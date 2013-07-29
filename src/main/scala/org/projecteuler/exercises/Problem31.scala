package org.projecteuler.exercises

object Problem31 {

  val target = 200;
  def compute: Int = {
    var ways = 0;
    for (a <- target to 0 by -200; b <- a to 0 by -100; c <- b to 0 by -50; d <- c to 0 by -20; e <- d to 0 by -10; f <- e to 0 by -5; g <- f to 0 by -2) {
      ways += 1;
    }

    ways
  }
}
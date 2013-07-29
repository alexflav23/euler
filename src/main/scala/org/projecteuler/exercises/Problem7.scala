package org.projecteuler.exercises

object Problem7 {

  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });

  def compute: Int = {
    ps drop 10000 head
  }
}
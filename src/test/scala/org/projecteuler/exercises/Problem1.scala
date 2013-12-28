package org.projecteuler.exercises

import org.projecteuler.exercises.Problem1
import org.scalatest.{ FlatSpec, Matchers }

class Problem1Test extends FlatSpec with Matchers {
  it should "compute the value to be " in {
    val value = 233168
    Problem1.compute shouldEqual value
  }
}
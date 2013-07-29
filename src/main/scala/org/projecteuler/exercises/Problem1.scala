package org.projecteuler.exercises

object Problem1 {
  def compute: Int = {
    1 until 1000 filter (value => { value % 3 == 0 || value % 5 == 0 }) sum
  }
}
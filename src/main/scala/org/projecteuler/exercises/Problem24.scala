package org.projecteuler.exercises

object Problem24 {
  def compute: String = {
    "0123456789".permutations.drop(999999).next
  }
}
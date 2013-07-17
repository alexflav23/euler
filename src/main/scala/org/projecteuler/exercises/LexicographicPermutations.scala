package org.projecteuler.exercises

object LexicographicPermutations {
  def compute: String = {
    "0123456789".permutations.drop(999999).next
  }
}
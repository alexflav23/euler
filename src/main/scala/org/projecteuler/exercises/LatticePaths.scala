package org.projecteuler.exercises

object LatticePaths {

  def numberOfPaths: Int = {
    val gridSize = 20
    var paths = 1
    for (i <- 0 until gridSize) {
      paths *= (2 * gridSize) - i;
      paths /= i + 1;
    }
    paths
  }
}
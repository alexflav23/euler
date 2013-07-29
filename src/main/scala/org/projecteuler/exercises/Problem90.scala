package org.projecteuler.exercises

import scala.collection.mutable.HashMap;

object Problem90 {

  val set = new HashMap[String, Int];
  def compute: Int = {

    "0123456789" combinations 6 foreach (combo => {
      set.put(combo.sortWith(_ < _), 0);
    })
    0
  }
}
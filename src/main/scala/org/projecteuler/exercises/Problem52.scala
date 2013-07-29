package org.projecteuler.exercises

object Problem52 {
  def identical(x: Int): Boolean = {
    var l = List[String]()
    1 to 6 foreach (num => { l = (x * num).toString.sortWith(_ < _) :: l });
    l forall (_ == l.head)
  }
  def compute: Int = {
    var x = 1;
    while (1 != 2) {
      if ((x * 6).toString.length == x.toString.length && identical(x)) {
        return x
      }
      x += 2;
    }
    x
  }
}
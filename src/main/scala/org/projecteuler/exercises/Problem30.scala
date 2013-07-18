
object Problem30 {

  def power(num: Int, sum: Double = 0): Double = {
    if (num > 0)
      power(num / 10, sum + math.pow(num % 10, 5))
    else {
      sum
    }
  }

  def main(args: Array[String]) = {
    val s = System.nanoTime
    var total = 0
    var i = 4000
    while (i < 198000) {
      if (i == power(i)) {
        total += i
      }
      i += 1
    }
    println(total)
    val f = System.nanoTime
    println("Solution took " + (f - s) / 1000000 + " miliseconds")
  }
}
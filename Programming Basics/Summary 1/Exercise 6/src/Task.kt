package summary6

fun testLong() {
  println(Long.MAX_VALUE + 1)
}

fun testDouble() {
  println(Double.MAX_VALUE + 1)
}

fun testDouble2() {
  println(Double.MAX_VALUE + 1 == Double.MAX_VALUE)
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
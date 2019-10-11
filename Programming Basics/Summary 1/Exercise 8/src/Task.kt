package summary8

fun everyFifth(start: Int, end: Int) {
  for (i in start..end) {
    if ((i - start) % 5 == 4) {
      println(i)
    }
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Expected output:
15
20
25
30
*/
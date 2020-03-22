// BaseClassInit/BCIExercise1.kt
package baseClassInitializationExercise1
import atomictest.*

private val trace = Trace()

open class A {
  init {
    trace("A")
  }
}

open class B : A() {
  init {
    trace("B")
  }
}

class C : B() {
  init {
    trace("C")
  }
}

fun main() {
  C()
  trace eq "A B C"
}
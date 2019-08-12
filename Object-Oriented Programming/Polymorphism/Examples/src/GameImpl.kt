// Polymorphism/GameImpl.kt
package polymorphism
import upcasting.*

interface Maze {
  fun all(): Set<GameElement>
}

class Game(val maze: Maze) {
  fun play() {
    maze.all().forEach { element ->
      element.playTurn()
    }
  }
}

class MazeImpl(
  val elements: Set<GameElement>
) : Maze {
  override fun all() = elements
}

fun main() {
  val maze = MazeImpl(setOf(Robot(),
      Bomb(), Wall()))
  Game(maze).play()  
}
/* Output:
Robot eats some food
Bomb blows up some elements
Static element does nothing
*/
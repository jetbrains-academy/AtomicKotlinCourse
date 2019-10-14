package constrainingVisibility1

import org.junit.Assert
import org.junit.Test
import util.checkParameters
import util.loadClass
import util.loadMemberFunction

class TestAlien {
  @Test
  fun test1() {
    val alienClass = loadClass("constrainingVisibility1", "Alien")
    val alienConstructor = alienClass.constructors.first()
    checkParameters(alienConstructor, listOf(
      "name" to "kotlin.String",
      "species" to "kotlin.String",
      "planet" to "kotlin.String"))

    val alienInstance = alienConstructor.call("Arthricia", "Cat Person", "PurgeWorld")
    Assert.assertEquals("Wrong 'toString' result after 'Alien' creation",
      "Alien Arthricia, Cat Person: PurgeWorld", alienInstance.toString())

    val movePlanetFunc = loadMemberFunction(alienClass, "movePlanet")
    checkParameters(movePlanetFunc, listOf("" to "", "" to "kotlin.String"))
    movePlanetFunc.call(alienInstance, "Earth C-137")

    Assert.assertEquals("Wrong result after moving planet",
      "Alien Arthricia, Cat Person: Earth C-137", alienInstance.toString())
  }
}
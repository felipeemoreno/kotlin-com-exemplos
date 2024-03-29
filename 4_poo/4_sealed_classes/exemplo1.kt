/**
 * Classes "Seladas".
 *
 * @see [Sealed Classes](https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes)
 */

sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5     
    }                                                                                   // 6
}

fun main() {
    val cat = Cat("Snowy")
    val human = Human("Felipe", "WR5")
    println(greetMammal(cat))
    println(greetMammal(human))
}
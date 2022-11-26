fun getName(): String? = null //"Alex"

fun main() {
    getName()?.let {name ->
        println("Hello $name")
    }

    val animals = arrayListOf("cat", "dog", "mouse")
    animals.map { it.length }
        .filter { it > 3 }
        .let { println("The size of the list is ${it.size}") }
}
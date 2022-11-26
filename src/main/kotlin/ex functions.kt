import kotlin.random.Random

fun main() {
    printArea(374.34)
    printArea(33.0)
    printArea(Random.nextDouble())
}

fun printArea(radius: Double) {
    val pi = 3.14159
    val area = pi * radius * radius
    println("The area with a radius of $radius is $area")
}
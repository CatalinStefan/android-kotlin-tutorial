import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val someLargeVariable: String by lazy { "A large value" }

    val rand = Random.nextInt()
    if (rand % 2 == 0)
        println(someLargeVariable)
}
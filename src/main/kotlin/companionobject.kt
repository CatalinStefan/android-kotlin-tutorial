class Car4 {
    companion object {
        fun getDrivingInstructions(): String {
            return "Drive safe"
        }
    }
}

fun main() {
    val message = Car4.getDrivingInstructions()
    println(message)
}
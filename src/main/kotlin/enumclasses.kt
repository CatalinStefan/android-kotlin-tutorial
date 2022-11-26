enum class Color {
    RED,
    GREEN,
    BLUE
}

fun main() {
    decide(Color.RED)
}

fun decide(color: Color) {
    when (color) {
        Color.RED -> println("You chose red")
        Color.GREEN -> println("You chose green")
        Color.BLUE -> println("You chose blue")
    }
}
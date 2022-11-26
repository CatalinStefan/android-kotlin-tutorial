fun main() {
    val name = "Dan"
    when (name[0].lowercase()) {
        "a", "b", "c" -> println("Hello $name, welcome!")
        "d", "e", "f" -> println("Hi $name, how are you?")
        else -> println("Hello")
    }
}
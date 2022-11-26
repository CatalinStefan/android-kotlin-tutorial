fun main() {
    val animal = "crocodile"
    var action: String
    when(animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }
    println(action)

    val month = "October"
    val days = when (month) {
        "April", "June", "September", "November" -> {
            println("do something")
            30
        }
        "February" -> 28
        else -> 31
    }
    println(days)
}
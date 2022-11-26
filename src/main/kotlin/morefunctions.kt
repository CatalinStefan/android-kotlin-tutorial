fun main() {
    multiply(3)
    multiply(3, 8)

    sayHello("Mary", "John", "Alex")

    listAnimals()
}

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

//fun multiply(number: Int, multiplier: Int = 2) = number * multiplier

fun sayHello(vararg names: String) {
    for (name in names)
        println("Hello $name")
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val myAnimals = listOf("cat", "dog", "cow", "horse")
    for (animal in myAnimals)
        listOneAnimal(animal)
}
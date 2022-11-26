class Type<T> {
    fun printMessage(item: T) {
        println("The item converted to a String is ${item.toString()}")
    }
}

fun main() {
    val type1 = Type<Float>()
    type1.printMessage(362.48F)

    val type2 = Type<HashMap<String, Int>>()
    type2.printMessage(hashMapOf("one" to 1, "two" to 2))
}
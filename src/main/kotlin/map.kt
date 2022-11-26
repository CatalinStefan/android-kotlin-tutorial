fun main() {
    val translation = mapOf("one" to "un", "two" to "deux", "three" to "troix")

    println(translation)

    println(translation.get("two"))
    println(translation["one"])

    println(translation.keys)

    val count = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    count.put(4, "four")
    println(count)

    count.replace(2, "twenty two")
    println(count)

    count.clear()
    println(count)
}
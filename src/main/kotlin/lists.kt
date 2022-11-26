fun main() {
    val letters = listOf("a", "b", "c", "b")
    println(letters[0])
    println(letters.get(2))

//    letters[3]

    println(letters.indexOf("b"))

//    letters.add("d")

    val letters2 = arrayListOf("a", "b", "c")
    letters2.add("d")
    println(letters2)
    letters2.remove("a")
    println(letters2)

    letters2.addAll(letters)
    println(letters2)

//    letters2.
}
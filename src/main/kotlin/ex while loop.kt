fun main() {
    val largeNumber = 372635

    var i = 0
    while (i < largeNumber) {
        if (i % 7 == 0)
            println(i)
        i++
    }
}
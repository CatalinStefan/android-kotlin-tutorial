fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear")
    for (animal in animals) {
        println("Feeding the $animal")
    }

    for (i in 1..3) {
        println("Strike $i")
    }
    println("You're out!")

    for (i in 10 downTo 0 step 3) {
        println(i)
    }


    for (i in 0..5) {
        for (j in 0..5) {
            print("$i, $j\t")
        }
        println()
    }

}
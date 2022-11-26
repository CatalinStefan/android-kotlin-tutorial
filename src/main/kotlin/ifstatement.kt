fun main() {
    val night = true
    val sleepy = false

//    if (night) {
//        println("Brush teeth")
//        if (sleepy)
//            println("Sleep")
//    } else
//        println("Be active")

    if (night) println("Brush teeth and sleep") else println("Be active")

    val number = 25

    val isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

    println(isEven)

    println("Finish execution")
}
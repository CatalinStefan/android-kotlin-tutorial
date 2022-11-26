fun main() {
    for (i in 1..5) {
        sayHello()
    }


    multiply(3, 8)

    double(5)
//    double(8, "8 * 2 = ")
    double(message = "8 * 2 = ", number = 8)

    val r = 27
    println("A circle with a radius of $r has an area of ${calculateCircleArea(r)}")
}

fun sayHello() {
    println("Hello everyone")
}

//fun double(number: Int) {
//    println("Double of $number is ${number * 2}")
//}

fun double(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

//fun multiply(a: Int, b: Int) {
//    println("${a * b}")
//}

//fun calculateCircleArea(r: Int): Double {
//    val pi = 3.1415
//    return pi * r * r
//}

fun calculateCircleArea(r: Int) = 3.1415 * r * r
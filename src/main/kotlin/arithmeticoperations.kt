fun main() {
    var a = 25
    val b = 83.67
    val r = a * b

    println("$r ${r::class.java}")

    a++

    println(a)

    var bikes = 5

//    bikes += 1
//    println(bikes)
    bikes %= 2
    println(bikes)
}
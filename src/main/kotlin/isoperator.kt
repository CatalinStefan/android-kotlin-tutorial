fun main() {
    val value = "Alligator"

    if (value is String)
        println("${value.length} characters")

    val myCar = getCar()
    if (myCar !is BMW)
        println("This is not my favourite brad")
    if (myCar is BMW)
        println("Awesome")

//    (myCar as BMW).drive()
    (myCar as? BMW)?.drive()
}

fun getCar(): Car6 = BMW()

open class Car6

class BMW: Car6() {
    fun drive() {
        println("Driving")
    }
}
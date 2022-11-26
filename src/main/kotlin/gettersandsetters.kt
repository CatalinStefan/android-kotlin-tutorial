class Car2 {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"
        }
}

fun main() {
    val myCar = Car2()
    myCar.speed = 100
    println("My car name: ${myCar.name}")
    println("My car speed: ${myCar.speed}")
}
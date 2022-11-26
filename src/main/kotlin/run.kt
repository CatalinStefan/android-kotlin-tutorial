fun main() {
    val myCar = Car().run {
        model = "BMW"
        topSpeed = 220
        start()
        this
    }
    println(myCar)

    run {
        val newCar = Car()
        newCar.start()
    }
}
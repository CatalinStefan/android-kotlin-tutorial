fun main() {
    val myCar = Car().apply {
        model = "Ferrari"
        topSpeed = 300
        drive(200)
    }.also {car ->
        println("Logging the car $car")
    }
}
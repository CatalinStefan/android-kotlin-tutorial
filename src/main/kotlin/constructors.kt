//class Vehicle(val model: String, var topSpeed: Int) {
//
//}

class Vehicle {

    var model: String? = null
    var topSpeed = 100

    constructor() {
        model = "No model"
        topSpeed = 100
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }
}

fun main() {
    val myCar = Vehicle("BMW", 200)
    println(myCar.model)

    val yourCar = Vehicle("Fiat")

    val herCar = Vehicle()

    println(yourCar.model)
    println(herCar.model)
}
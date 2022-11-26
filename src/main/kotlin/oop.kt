class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}

fun main() {
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(100)

    val myDog = Corgi()

    println(myDog.size)
    myDog.lookCute()
    myDog.bark()
    myDog.play()
}

open class Dog {
    var size: Int = 20

    fun bark() {
        println("Barking")
    }

    fun play() {
        println("Playing")
    }
}

class Corgi : Dog() {
    fun lookCute() {
        println("Cute puppy")
    }
}






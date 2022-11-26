interface Oven {
    var temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook() {
        println("Cooking at $temperature degrees")
//        temperature = 200
    }
}

class Samsung : Oven {
    override var temperature = 200
    val warrantyYears = 2

    override fun turnOn() {
        println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }
}

//class Bosch: Oven {
//
//}

fun ovenFactory(): Oven = Samsung()

fun main() {
    val myOven = ovenFactory()
//    myOven.warrantyYears
    myOven.turnOn()
    myOven.cook()
    myOven.turnOff()
}





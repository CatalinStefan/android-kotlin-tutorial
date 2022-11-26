import kotlin.random.Random

interface Coffee {
    fun wakeUp()
    fun quenchThirst()
}

class Arabica: Coffee {
    override fun wakeUp() {
        println("Waking you up with Arabica")
    }

    override fun quenchThirst() {
        println("Quenching your Arabica thirs")
    }
}

class Robusta: Coffee {
    override fun wakeUp() {
        println("Robusta will wake you up")
    }

    override fun quenchThirst() {
        println("Robusta will quench your thirst")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        return if (Random.nextInt() % 2 == 0)
            Arabica()
        else
            Robusta()
    }
}

fun main() {
    val myCoffeeShop = CoffeeShop()
    for (i in 1..5) {
        val coffee = myCoffeeShop.purchaseCoffee()
        coffee.wakeUp()
        coffee.quenchThirst()
    }
}







class Car5 {
    val engine = Engine()
    var speed = 100

    fun drive() {
        engine.run()
        println("Driving at $speed")
    }

    inner class Engine {
        val rpm = 500
        fun run() {
            this@Car5.speed = 150
            println("Engine running")
        }
    }
}

fun main() {
    val myCar = Car5()
    myCar.drive()
}
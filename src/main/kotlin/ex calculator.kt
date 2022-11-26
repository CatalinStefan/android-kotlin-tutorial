class Calculator {
    var total = 0.0

    fun add(a: Double) {
        total += a
        println("+ $a")
        println("= $total")
    }

    fun sub(a: Double) {
        total -= a
        println("- $a")
        println("= $total")
    }

    fun mul(a: Double) {
        total *= a
        println("* $a")
        println("= $total")
    }

    fun div(a: Double) {
        total /= a
        println("/ $a")
        println("= $total")
    }

    fun reset() {
        total = 0.0
        println("reset")
        println("= $total")
    }
}

fun main() {
    val calc = Calculator()
    calc.add(37.0)
    calc.mul(17.0)
    calc.div(37.9)
    calc.sub(82.6)
    calc.reset()
    calc.add(22.2)
}



abstract class Engine(val rpm: Int) {
    fun run() {
        println("Engine running at $rpm rpm")
    }
}

class GEEngine(val ge_rpm: Int): Engine(ge_rpm) {
    fun start() {
        println("Starting engine")
        run()
    }
}

fun main() {
//    val eng = Engine(1000)
    val eng = GEEngine(1000)
    eng.start()
}
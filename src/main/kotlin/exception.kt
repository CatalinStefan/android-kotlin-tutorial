import java.lang.NumberFormatException

fun main() {
    var amount = "15"
    amount = "abc"
    try {
        println(amount.toInt())
    } catch (e: NumberFormatException) {
        println("A number format exception occurred.")
    } catch (e: Exception) {
        println("A general exception occurred")
    } finally {
        println("Execution has completed")
    }

    throw IllegalStateException("I don't like this input")


    println("More code here")
}
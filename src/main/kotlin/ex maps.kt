fun main() {
    var attendance = hashMapOf("23 Sept" to 2635, "24 Sept" to 7463, "25 Sept" to 251)

    attendance["26 Sept"] = 3847

    println(attendance)

    val peopleOn25 = attendance["25 Sept"] ?: 0
    val peopleOn26 = attendance["26 Sept"] ?: 0
    println("People on 25 and 26 Sept: ${peopleOn25 + peopleOn26}")

    println("Is data available for 22 Sept? ${attendance.containsKey("22 Sept")}")
}
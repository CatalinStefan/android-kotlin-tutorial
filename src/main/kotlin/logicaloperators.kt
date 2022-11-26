fun main() {
    println(true && true)

    val isDog = true
    val isBlack = false

    val blackDog = isDog && isBlack

    println(blackDog)

//    if (blackDog) {
//        println("I found a black dog")
//    } else {
//        println("No black dogs around")
//    }

    println(blackDog == true)

    val age = 15
    val isHuman = false

    val isTeenager = ((age >= 13) && (age < 20)) && isHuman

    println("isTeenager=$isTeenager")

}
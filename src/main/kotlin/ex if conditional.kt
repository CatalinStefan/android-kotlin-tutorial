fun main() {
    val hasEggs = true
    val hasBacon = false

    val eggPrice = 5
    val baconPrice = 20
    var total = 0

    if (hasEggs){
        total += 12 * eggPrice
        if (hasBacon)
            total += 2 * baconPrice
    } else {
        println("No eggs available")
    }

    println("Total is $total")
}
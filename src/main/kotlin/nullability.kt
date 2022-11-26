fun main() {
    var catName: String? = "Fluffy"
//    catName = null

    println(catName)

    println(catName?.length)

    println(catName ?: "This cat has no name")

    println(catName!!.length)

    var amount: Int? = 4

    println(amount?.times(3))
}
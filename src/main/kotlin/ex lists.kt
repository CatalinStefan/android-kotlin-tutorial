fun main() {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")

    items.removeAll(removedItems)
    println(items)
}
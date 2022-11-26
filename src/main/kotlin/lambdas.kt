fun main() {
    val myLambda = { name: String -> println("Hello $name!") }
    val names = listOf("Mary", "Kate", "Mike")

//    sayHello(names, myLambda)

    val clients = listOf("Anna", "Bob", "Carol", "David")

//    clients.forEach { println("Hello $it") }

    clients.filter { it.length < 5 }.forEach { println("Hello $it") }

    val newClients = clients.map { it.length }
    println(newClients)

    val sortedClients = clients.sortedBy { it.length }
    println(sortedClients)

    val max = clients.maxByOrNull { it.length }
    println(max)

    val min = clients.minByOrNull { it.length }
    println(min)

}

fun sayHello(names: List<String>, doSomething: (String) -> Unit ) {
    for (name in names)
        doSomething(name)
}
fun main() {
    val customers = hashSetOf("Michael", "Alice", "John")

    val joiningCustomer = "Bob"
    customers.add(joiningCustomer)
    println(customers)

    val leavingCustomer = "John"
    customers.remove(leavingCustomer)
    println(customers)
}
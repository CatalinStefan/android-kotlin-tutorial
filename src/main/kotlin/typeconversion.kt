fun main() {
    val cats = 3
    val longCats = cats.toLong()

    println("$longCats ${longCats::class.java}")

    val people = 7_500_000_000
    println(people::class.java)

    val fewPeople = people.toInt()
    println("$fewPeople ${fewPeople::class.java}")

    println(cats.toString()::class.java)

    val pi = 3.1415
    println(pi.toString()::class.java)
}
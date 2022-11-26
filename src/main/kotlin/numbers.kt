fun main(){
    val price = 12.99
    val amount = 3
    val total = price * amount

    println("Total is $total")

    println("Price $price ${price::class.java}")
    println("Amount $amount ${amount::class.java}")

    var dogs: Byte = 3
    println("Dogs $dogs ${dogs::class.java}")

    var life = 42L
    println("Life $life ${life::class.java}")

    var money: Float = 6.99F
    println("Money $money ${money::class.java}")
}
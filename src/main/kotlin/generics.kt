class Box<T> {
     fun display(item: T) {
          println(item)
     }
}

fun main() {
    val myArray = arrayListOf<String>()

     val myBox = Box<String>()
     myBox.display("Contents")

     val yourBox = Box<Int>()
     yourBox.display(42)

     val chef = Chef<Apple2>()
     chef.cook(Apple2())
}

abstract class Fruit2 {
     abstract fun peel()
}

class Apple2: Fruit2() {
     override fun peel() {
          println("Peeling the apple")
     }
}

class Chef<T: Fruit2> {
     fun cook(item: T) {
          item.peel()
     }
}
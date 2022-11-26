data class User(
    val name: String,
    val email: String,
    val password: String
)

fun main() {
    val user = User("John", "john@gmail.com", "1234")
    println(user)
}
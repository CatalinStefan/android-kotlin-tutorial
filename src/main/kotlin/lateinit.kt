fun main() {
    lateinit var networkService: String
    networkService = getNetworkService()
    println(networkService)
}

fun getNetworkService() = "Network service"
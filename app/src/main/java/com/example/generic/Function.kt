
class Function(val nama : String = "Dinda") {

    fun <T> sayHello(param : T){
        println("Hello $param, My name is $nama")
    }
}

fun main() {
    val function = Function ("Dinda")

    function.sayHello(10)
}
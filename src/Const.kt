//the const value will be know before the code execution
//it cannot be defined inside the function
const val PI = 3.14

val pi = getPi()
//const cannot be depend on function
//const val pi_2 = getPi()
fun main() {
    var name = "Amy"
    name = "Tom"

    val age = 19
    println("Name: ${name}, Age: $age")
}

fun getPi(): Double = 3.22
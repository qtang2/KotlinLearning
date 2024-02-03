
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
//import kotlin.math.*

fun main() {
    val number1 = 10
    val number2 = 3
    println("+ ${number1+number2}")
    println("- ${number1-number2}")
    println("* ${number1*number2}")
    println("/ ${number1/number2}")
    println("% ${number1%number2}")
    println(PI)
    println(max(20,40))
    println(min(20,40))

    var number = 10
    println(++number) // increase number and return the value, 11
    println(number++) // return the value, then increase the number 11
    println(number) // 12

    println(--number) // increase number and return the value, 11
    println(number--) // return the value, then increase the number 11
    println(number) // 10
}
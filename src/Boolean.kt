
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
//import kotlin.math.*

fun main() {
    val isAdult = false
    val isFemale = true
    val isCompleted: Boolean? = null // this is a boolean value but it can be null
//    possible value for Boolean is true false and null
    println(isCompleted)

//    logical operator
    println(isAdult && isFemale)
    println(isAdult || isFemale)
    println(!isAdult)

//    compare operator
    val n1 = 10
    val n2 = 20
    println(n1>n2)
    println(n1>=n2)
    println(n1<n2)

//    if is an expression instead of statement
    val value = if(n1<n2){
//        println(":)")
        ":)"
    }else if(n1==100){
        println("???")
        "???"
    }else{
        println(":(")
        ":("
    }

    println(value)

//    ternary
//    in Java
//    var r = n1>= n2 ? ":)" : ":("
    val r = if(n1>=n2) ":)" else ":("
    println("r ==> $r")

    val r2 =
        if(n1>=n2) ":)"
        else if(n1==100) "???"
        else ":("
    println("r2 ==> $r")



}
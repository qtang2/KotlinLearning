fun main() {

    val gender = "Mss"

    val g = when(gender) {
//        if  no return value, it is just statement
//        "F" -> println("Female")
//        "M" -> println("Male")
//        else -> {
//            println("Unknown")
//        }

//        returns value, it is an expression
        "F" -> "Female"
        "M" -> "Male"
        else -> {
            "Unknown"
        }
    }
    println(g)


//    if statement can be changed to when
    val n1 = 100
    val n2 = 20
    when {
        (n1>n2) -> println(":)")
        (n1==100) -> println("==100")
        else -> {
            println("Nothing")
        }
    }

//    can use range in when
    val age = 18
    when(age) {
//        just use .. to express range
        in 13..19 -> println("teenager")
        !in 0..12 -> println("kids")
        else -> println("Adult")
    }


}
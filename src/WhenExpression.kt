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

}
fun main() {
    val name = "Anmdndlfd"
    val age = 90

//    if need any operation or call function, need to add {}
    val msg = "Name $name, Age: ${age+1}, %s"
    println(msg)

//    multiple line string
//    if will keep the indentation of the string
//    %s is the replacement for argument of .format function
//    format function can be used for a normal string too
    val email = """
        Hello %s
        How
          Are
        You
    """.trimIndent()

    println(email.format("Amy"))
    println(msg.format("OKK"))

}
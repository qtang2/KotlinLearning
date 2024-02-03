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

    val name1 = "Amy"
    val name2 = "Tom"
    val name3 = "Amy"
//    the name 1 and name 2 are stored in the string pool, when name 3 comes, it will check the string pool, if there
//    one string with same content already exist, then it will point to the same string
    val name4 = String("Amy".toCharArray()) // create a brand-new string object
    println("== : ${name1 == name3}") // return true as compare the content
    println(".equals ${name1 == name3}") // return true as compare the content
    println("=== : ${name1 === name3}")  // return true as compare the memory reference
    println("=== : ${name1 === name4}") // return false as compare the memory reference


}
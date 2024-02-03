fun main() {
//    var name: String = "Amy"
//    var age: Int = 19
//    println("Name: ${name}, Age: ${age}")
//    Variable is never modified, so it can be declared using 'val'
    var name = "Amy"
    name = "Tom"

//    val declare the variable whose value cannot be assigned
//    equals to in Java: final String age = 79
    val age = 19
//    age = 70
//    for int type, no need to put curly braces
    println("Name: ${name}, Age: $age")
}
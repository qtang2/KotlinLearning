fun main() {
//    Kotlin has null safety policy
    var name: String = "yyyyy"
    println(name.uppercase())

    var brand: String? = "aaaa" // need to put ? if variable can be null
    println(brand?.uppercase())

    var brandNull: String? = null
    println(brandNull?.uppercase()) // this will print null with no error


}
fun main() {
    greet("Amy", 70)
//    explicit specify the argument
    greet(age=10, name="AmySis")
    greet( name="Aya")
}
//Unit is equal to void in Java
fun greet(name: String, age:Int = -1): Unit {
    println("Hello $name")
    if(age == -1){
        println("Age default value is $age")
    }
    if(age>=18){
        println("is adult")
    }else {
        println("is not adult")
    }
}
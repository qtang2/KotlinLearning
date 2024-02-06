fun main() {
    greet("Amy", 70)
//    explicit specify the argument
    greet(age=10, name="AmySis")
    greet( name="Aya")

    foo( bar = {
        println("bar func 1")
    })
    foo( bar = {
        println("bar func 2")
    })

//    can invoke the foo function without () as below
//    but this will only work when the function argument is the last argument
    foo {
        println("bar function 3")
    }
    foo()
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

//pass function as argument
fun foo(bar: () -> Unit = {} ) {
    println("bar function-------")
    bar()
}
fun main() {
    greet("Amy", 70)
//    explicit specify the argument
    greet(age=10, name="AmySis")
    greet( name="Aya")

    functionAsArgs( bar = {
        println("bar func 1")
    })
    functionAsArgs( bar = {
        println("bar func 2")
    })

//    can invoke the functionAsArgs function without () as below
//    but this will only work when the function argument is the last argument
    functionAsArgs {
        println("bar function 3")
    }
    functionAsArgs()

    val doubledNum = double(10)
    println(doubledNum)

    val (v1,v2) = returnTwoValues()
    println("v1 $v1, v2 $v2")
    val (t1,t2,t3) = returnThreeValues()
    println("t1 $t1, t2 $t2, t3 $t3")

    println()

    val s = returnString()
    println(s)

}
//Unit is equal to void in Java
fun greet(name: String, age:Int = -1): Unit {
    println("Hello $name")
    if(age == -1){
        println("Age default value is $age")
//        exit the method
        return
    }
    if(age>=18){
        println("is adult")
    }else {
        println("is not adult")
    }
}

//pass function as argument
fun functionAsArgs(bar: () -> Unit = {} ) {
    println("bar function-------")
    bar()
}

//if there is { } for the function, need to specify return type if the return type is not Unit
fun double(n: Int): Int {
    return n*2
}
//if function only have one return statement, can define the function as below
fun double2(n: Int): Int  = n*2
//fun double2(n: Int)  = n*2

// return multiple values
fun returnTwoValues(): Pair<String, Int> =
    "Amy" to 20
    // Pair("Amy", 20)

fun returnThreeValues(): Triple<String, Int, Char> {
    return Triple(
        "Amy",
        39,
        'Z'
    )
}

fun returnString(): String = "return string value"


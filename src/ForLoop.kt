fun main() {

//    list are expandable , array is not
    val list: List<String> = listOf("aaa", "bbbb", "ddd","ggg")
     for( name in list) {
//         println(name)
         val n = name.replaceFirstChar { it.uppercase() }
         println(n)
     }

    val numbers: List<Int> = listOf(1,2,3,8,4)
    for( number in numbers) {
        println(number)
    }

    val letters= charArrayOf('A', 'B', 'C', 'D')
    for( index in letters.indices) {
        println("index: $index, ${letters[index]}")
    }
    println("reverse")
    for( index in letters.indices.reversed()) {
        println("index: $index, ${letters[index]}")
    }

    println("loop range")
    for(i in 1..10){
        println(i)
    }

    for(i in 1..10 step 2){
        println("step ==> $i")
    }

    for (i in 5 downTo 1) println("reverse downTo $i")
    for (i in 5 downTo 1 step 2) println("reverse downTo step $i")

    println("Loop strings")
    val brand = "addfdsfd"
    for(l in brand) println("string loop $l")

    println("for each")
    list.forEach { println(it) }

    println("while loop")
    var num = 1
    while(num<=5) {
        println("num $num")
        ++num
    }

    var idx = 0
    while(idx<brand.length) {
        println("brand letter ${brand[idx]}")
        ++idx
    }

    println("do while loop")
    do {
        println("do action")
    }while (false)

    println("loop break continue")

    for (n in numbers) {
        if(n%2==0){
            continue
        }

        if(n > 6) {
            break
        }
        println("n is ==> $n")


    }

//    for each cannot use break and continue keywords

}
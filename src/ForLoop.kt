fun main() {

//    list are expandable , array is not
    val list: List<String> = listOf("aaa", "bbbb", "ddd","ggg")
     for( name in list) {
//         println(name)
         val n = name.replaceFirstChar { it.uppercase() }
         println(n)
     }

    val numbers: List<Int> = listOf(1,2,3,4)
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



}
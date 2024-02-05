fun main() {
    val names = arrayOf("aaa", "bbbb", 3)
//    size cannot be changed
    val nameStrList = arrayOf<String>("aaa", "bbbb", "ddd")
    println(names.contentToString())
    println(nameStrList[0])
    nameStrList[0] = "CCC"
    println(nameStrList.size)
    if ("hello" in nameStrList) {
        println("found")
    }else {
        println("not found")
    }
//    println(nameStrList[2]) ArrayIndexOutOfBoundsException

    val nullArr = arrayOfNulls<String>(5)
    nullArr[3] = "hello"
    nullArr.fill("&")
    println(nullArr.contentToString())

//    list are expandable , array is not
    val list: List<String> = listOf("aaa", "bbbb", "ddd","ggg")
    println(list)
    println(list.size)
    println(list.contains("bbbb"))
    println(list.first())
    println(list.last())
    println(list.indexOf("ddd"))
//    add a new item, need to create mutable list
    val newList = mutableListOf("aaa", "bbbb", "ddd","ggg")
    newList.remove("ggg")
    println(newList)
    newList.add("PPPPP")
    println(newList)
    println(newList.isEmpty())


}
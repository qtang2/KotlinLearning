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
}
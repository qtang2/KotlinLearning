fun main() {
//objects
    val tv = SmartDevice()
    tv.price = 1000.0
    tv.brand = "TCL"
    val phone = SmartDevice()
    tv.price = 100.0
    tv.brand = "TCL"
//    tv.price1 = 10.0 cannot do this as val is immutable
}

//blueprint
class SmartDevice {
//    properties - variables
    var brand: String = ""
    var price: Double = 0.0
    val price1: Double = 0.0
//    behaviors - functions
}

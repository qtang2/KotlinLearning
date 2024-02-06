fun main() {
//objects
    val tv = SmartDevice()
    tv.price = 1000.0
    tv.brand = "TCL"
    println("tv ${tv.brand}, ${tv.price}")
    val phone = SmartDevice()
    phone.price = 100.0
    phone.brand = "Apple"
//    tv.price1 = 10.0 cannot do this as val is immutable
    println("phone ${phone.brand}, ${phone.price}")
    println("phone state ${phone.getDeviceState()}")
    phone.turnOn()
    println("phone state ${phone.getDeviceState()}")
    

}

//blueprint
class SmartDevice {
//    properties - variables
    var brand: String = ""
////    default getter: get() = field
//        get() = field
//        get() = "foo"
////    default getter
//        set(value) {
//            field = value
//        }
    var price: Double = 0.0
//        get() = "foo"
//    val price1: Double = 0.0

    var isSwitchedOn: Boolean = false

    fun getDeviceState() = isSwitchedOn

//    behaviors - functions
    fun turnOn() {
        isSwitchedOn = true
        println("$brand Turn on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand Turn Off")
    }


}

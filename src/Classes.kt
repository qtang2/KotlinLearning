fun main() {
//objects
    val tv = SmartDevice(
        "TCL",
        100.0
    )
//    tv.price = 1000.0
//    tv.brand = "TCL"
    println("tv ${tv.brand}, ${tv.price}")
    val phone = SmartDevice("Apple", 890.0)
//    phone.price = 100.0
//    phone.brand = "Apple"
//    tv.price1 = 10.0 cannot do this as val is immutable
    println("phone ${phone.brand}, ${phone.price}")
    println("phone state ${phone.getDeviceState()}")
    phone.turnOn()
    println("phone state ${phone.getDeviceState()}")

    val tv2 = SmartDevice()

    val phone2 = SmartDevice("Samsung")


}

//blueprint
// can save the keyword constructor
class SmartDevice (
//class SmartDevice constructor(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
//    brand: String,
//    price: Double,
//    isSwitchedOn: Boolean = false
    ) {
//    properties - variables
//    can declare inside the constructor
//    var brand = brand
//////    default getter: get() = field
////        get() = field
////        get() = "foo"
//////    default getter
////        set(value) {
////            field = value
////        }
//    var price= price
////        get() = "foo"
////    val price1: Double = 0.0
//
//    var isSwitchedOn = isSwitchedOn

//    multiple constructor
//    call the main constructor, this represents the main constructor
    constructor() : this("", 9.0)

//    another way of giving default value of the properties
    constructor(brand: String): this(null, 10.0)

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

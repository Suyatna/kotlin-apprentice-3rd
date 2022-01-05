import kotlin.properties.Delegates

class IceCream {
    // val name: String
    // using default value for the name property
    val name: String = ""

    // val ingredients: ArrayList<String>
    // lazily initialize the ingredients list
    val ingredients: ArrayList<String> by lazy {
        arrayListOf()
    }
}

class FuelTank {
    // var level = 0.0 // decimal percentage between 0 and 1

    // 1. add a lowerFuel property of Boolean type to the class
    // 2. flip the lowerFuel Boolean when the level drops below 10%
    // 3. ensure that when the tank fills back up, the lowFuel warning will turn off
    var lowerFuel = false
    var level: Double by Delegates.observable(0.0) {
        _, _, new ->
        lowerFuel = new < 0.1
    }
}

// 4. add a FuelTank property to Car and fill the tank. then drive around for a while
class Car(val make: String, val color: String, val tank: FuelTank = FuelTank())

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
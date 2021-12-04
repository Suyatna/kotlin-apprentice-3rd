fun main() {
    printMyName()
    printMultipleOfFive(10)

    // parameter named arguments
    printMultipleOf(multiplier = 4, andValue = 2)

    println(multiply(2, 2))

    val (product, quotient) = multiplyAndDivide(4, 2)
    println("product: $product")
    println("quotient: $quotient")

    println("fun inferred: ${multiplyInferred(3, 3)}")

    incrementAndPrint(8)
    println()

    println("overloading")
    println(getValue(118))
    println(getValue("90 (text)"))
    println()

    // 2.
    printFullName("Suyatna", "Light")
    println()

    println(function(4, 2))
    printResult(::add, 4, 2)

    infiniteLoop()
}

// function basic
fun printMyName() {
    println("my name is suyatna")
}

// function parameters
fun printMultipleOfFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}

// parameter default values
fun printMultipleOf(multiplier: Int, andValue: Int = 1) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

// return value
fun multiply(number: Int, multiplier: Int): Int {
    return number * multiplier
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}

// function expression
fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

// parameters as values
fun incrementAndPrint(value: Int): Int {
    val newValue = value + 1
    println(newValue)
    return newValue
}

// overloading
fun getValue(value: Int): Int {
    return value + 1
}

fun getValue(value: String): String {
    return "the value is $value"
}

// Mini-Exercises
// 1.
fun printFullName(firstName: String, lastName: String) {
    println("$firstName  $lastName")
}

// 3.
// 4.
fun calculateFullName(fullName: String, lengthName: Int): Pair<String, Int> {
    return Pair(fullName, fullName.length)
}

// Functions As Variables
fun add(a: Int, b:Int): Int {
    return a + b
}

var function = ::add

fun printResult(function: (Int, Int) -> Int, a: Int, b: Int) {
    val result = function(a, b)
    print(result)
}

// The Land Of No Return
fun infiniteLoop(): Nothing {
    while (true) {

    }
}
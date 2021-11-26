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
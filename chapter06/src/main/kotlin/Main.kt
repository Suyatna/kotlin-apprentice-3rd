fun main() {
    printMyName()
    printMultipleOfFive(10)
    printMultipleOf(4, 2)
}

// function basic
fun printMyName() {
    println("my name is suyatna")
}

// function parameters
fun printMultipleOfFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}

fun printMultipleOf(multiplier: Int, andValue: Int) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}
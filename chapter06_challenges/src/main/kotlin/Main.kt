fun main() {
    println("Hello World!")
    println()

    println(isPrime(89))
}

// 1. it's prime time
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    var divisionCount = 0
    for (i in 1..number) {
        if (number % i == 0) {
            divisionCount += 1
        }
    }

    return divisionCount == divisor
}

fun isPrime(number: Int): Boolean {
    return isNumberDivisible(number, 2)
}
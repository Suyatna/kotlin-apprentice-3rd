fun main() {
    println("Hello World!")
    println()

    println(isPrime(6))
    println(isPrime(13))
    println(isPrime(8893))
    println()

    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(10))
    println()
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

// 2. recursive functions
fun fibonacci(number: Int): Int {
    var finalNumber = 0

    for (i in 0..number) {
        finalNumber = when (i) {
            0 -> 0
            1 -> 1
            2 -> 1
            else -> {
                fibonacci(number-1) + fibonacci(number-2)
            }
        }
    }

    return finalNumber
}
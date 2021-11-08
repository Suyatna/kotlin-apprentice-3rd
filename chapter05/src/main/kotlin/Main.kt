fun main() {
    // Ranges
    // Closed Range
    val closedRange = 0..5
    println(closedRange)

    // Half-Open Range
    val halfOpenRange = 0 until 5
//    println(halfOpenRange)

    // Decreasing Range
    val decreasingRange = 5 downTo 0
//    println(decreasingRange)

    // For Loops
    val count = 10

    var sum = 0
//    for (i in 1..count) {
//        sum += i
//        print("$sum ")
//    }

    // Repeat Loops
    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        print("sum: $sum ")
        lastSum = temp
        print("lastSum: $lastSum ")
        println()
    }
}
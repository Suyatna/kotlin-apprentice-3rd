fun main() {
    // Ranges
    // Closed Range
//    val closedRange = 0..5
//    println(closedRange)

    // Half-Open Range
//    val halfOpenRange = 0 until 5
//    println(halfOpenRange)

    // Decreasing Range
//    val decreasingRange = 5 downTo 0
//    println(decreasingRange)

    // For Loops
//    val count = 10

    //    for (i in 1..count) {
//        sum += i
//        print("$sum ")
//    }

    // Repeat Loops
//    sum = 1
//    var lastSum = 0
//    repeat(10) {
//        val temp = sum
//        sum += lastSum
//        print("sum: $sum ")
//        lastSum = temp
//        print("lastSum: $lastSum ")
//        println()
//    }

    // Steps In Loops
//    sum = 0
//    for (i in 1..count step 2) {
//        sum += i
//        println(sum)
//    }

//    sum = 0
//    for (i in count downTo 1 step 2) {
//        sum += i
//        println(sum)
//    }

    // Labeled Statements
    var sum = 0
//    rowLoop@ for (row in 0 until 8) {
//
//        println()
//        columnLoop@ for (column in 0 until 8) {
//            if (row == column) {
//                continue@rowLoop
//            }
//            sum += row * column
//
//            print("$sum ")
//        }
//    }

    // Mini-Exercises
    // 1.
//    val range = 1..10
//    for (i in range) {
//        println("$i^2 = ${i * i}")
//    }

    // 2. done

    // 3.
    sum = 0
    for (row in 1 until 8 step 2) {
//        if (row % 2 == 0) {
//            continue
//        }

        for (column in 0 until 8) {
            sum += row * column
        }

        println(sum)
    }
}
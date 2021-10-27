import kotlin.math.*

fun main() {

    // This is a comment. It is not executed.

    // This is also a comment.
    // Over multiple lines.

    /* This is also a comment.
    *  Over many
    *  Many...
    *  Many Lines. */

    // Printing Out
//    println("Hello, kotlin apprentice reader!!")

    // Arithmetic Operations
    // Simple Operations
//    println(2 + 6)
//    println(10 - 2)
//    println(2 * 4)
//    println(24 / 3)

    // Decimal Numbers
//    println(22.0 / 7.0)

    // The Reminder Operation
    // Modulo
//    println("%.0f".format(28.0 % 10.0))

    // Shift Operations
//    println(1 shl 3)
//    println(32 shr 2)

    // Math Functions
//    println(sin(45 * PI / 180))
//    // 0.7071067811865475
//
//    println(cos(135 * PI / 180))
//    // -0.7071067811865475
//
//    println(sqrt(2.0))
//
//    println(max(5, 10))
//
//    println(min(-3, -15))

    // Naming Data
//    // Constants
//    val number: Int = 10
//    // number = 0
//    // Val cannot be reassigned
//
//    val pi: Double = 3.14159
//
//    // Variable
//    var variableNumber: Int = 42
//    variableNumber = 0
//    variableNumber = 1_000_000

    // Increment and Decrement
    var counter = 0
    counter += 1
    // counter = 1

    counter -= 1
    // counter = 0

//    var counter: Int = 0
//    counter = counter + 1
//    counter = counter - 1

    counter = 10

    counter *= 3 // Same as counter = counter * 3
    // counter = 30

    counter /= 2 // Same as counter = counter / 2
    // counter 15

    // Mini-Exercises
//    // 1. Declare a constant of type Int called myAge and set it to your age.
//    val myAge: Int = 23
//
//    // 2. Declare a variable of type Double called averageAge.
//    //    Initially, set it to your own
//    //    age. Then, set it to the average of your age and the age of 30.
//    var averageAge: Double = 23.0
//    averageAge = 30.0 / 23.0
//
//    // 3.
//    val testNumber: Int = 15
//    val evenOdd = testNumber % 2
//    println(evenOdd)

    // 4.
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    println(answer shr 3)
}
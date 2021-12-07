fun main() {
    // 1. You Be The Compiler
    var name: String? = "Ray" // valid
    // var age: Int = null // not valid // null can't be a value of not-null type
    // val distance: Float = 26.7 // The floating-point number literal doesn't conform to the expected type Float // Should use 0.0F
    var middleName: String? = null // valid

    println(name)
    println(middleName)
    println()

    divideIfWhole(10, 2)
    divideIfWhole(10, 3)
    divideIfWhole(15, 3)
    divideIfWhole(21, 7)
    divideIfWhole(27, 4)
    divideIfWhole(25, 5)
    divideIfWhole(81, 9)
}

// 2. Divide And Conquer
fun divideIfWhole(value: Int, divisor: Int): Int? {
    val resultWholeNumber: Int?

    return if (value % divisor == 0) {
        resultWholeNumber = value / divisor

        println("Yep, it divides $resultWholeNumber")
        resultWholeNumber
    } else {
        resultWholeNumber = null

        println("Not divisible :[")
        resultWholeNumber
    }
}
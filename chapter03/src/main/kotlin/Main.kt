fun main() {
    // Type Conversion
//    var integer: Int = 100
//    var decimal: Double = 12.5
//    // integer = decimal
    /*
    Type mismatch.
    Required: Int
    Found: Double
     */

//    integer = decimal.toInt()

    // Operator With Mixed Types
//    val hourlyRate: Double = 19.5
//    val hoursWorked: Int = 10
//    val totalCost: Double = hourlyRate * hoursWorked
//    println(totalCost)

    // Type Inference
//    val typeInferredInt = 42
//    val typeInferredDouble = 3.14159
//    val actuallyDouble = 3.toDouble()

    // Mini-Exercises
    // 1.
//    val age1 = 42
//    val age2 = 21
//    // inferred by Int, yes

    // 2.
//    val avg1 = (age1 + age2) / 2
//    // avg1 is Int, so don't bring exact value

    // 3.
//    val avg1: Double = ((age1 + age2) / 2).toDouble()
//    println(avg1)

    // Strings In Kotlin
    // Characters And Strings
//    val characterA: Char = 'A'
//    val stringDog: String = "Dog"

    // Concatenation
    var message = "Hello" + " my name is "
    val name = "Suyatna"
    message += name
//    println(message)

    val exclamationMark = '!'
    message += exclamationMark
//    println(message)

    // String Templates
    message = "Hello my name is $name!" // "Hello my name is Suyatna!"

    val oneThird = 1.0 / 3.0
    // val oneThirdString = "One third is $oneThird as a decimal."
    val oneThirdString = "One third is ${1.0 / 3.0} as a decimal."
//    println(oneThirdString)

    // Multi-line Strings
    val bigString = """
        You can have string
        that contains multiple
        lines
        by
        doing this.
    """.trimIndent()
//    println(bigString)

    // Mini-Exercises

    // 1.
    val fistName = "Suyatna"
    val lastName = "Light"

    // 2.
    val fullName = "$fistName $lastName"

    val myDetails = "Hello, my name is $fullName"
    println(myDetails)
}
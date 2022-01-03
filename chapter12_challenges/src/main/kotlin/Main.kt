fun main() {
    // challenge 1
    val theseGoToEleven = 11
    if (Threshold.isAboveThreshold(theseGoToEleven)) {
        println("needed that extra push over the cliff.")
    } else {
        println("not bad.")
    }
    println()

    // challenge 2
    val studentMap = mapOf("first_name" to "neils", "last_name" to "bohr")
    val student = Student.loadStudent(studentMap)
    println(student)
    println()

    // challenge 3
    val thresholdChecker = object : ThresholdChecker {
        override val lower = 7
        override val upper = 10

        override fun isLit(value: Int) = value > upper
        override fun tooQuiet(value: Int) = value <= lower
    }

    if (thresholdChecker.isLit(11)) {
        println("that's what we do")
    } else {
        println("where can you go from there?")
    }

    if (thresholdChecker.tooQuiet(6)) {
        println("crank it up!")
    } else {
        println("rock in!")
    }
}

/*

Challenge 1
Create a named object that lets you check whether a given `Int` value is above a threshold.
Name the object `Threshold` and add a method `isAboveThreshold(value: Int)`.

*/

object Threshold {
    private const val threshold = 10

    fun isAboveThreshold(value: Int) = value > threshold
}
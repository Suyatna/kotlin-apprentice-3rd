val months = arrayOf(
    "January", "February", "March",
    "April", "May", "June",
    "July", "August", "September",
    "October", "November", "December"
)

class SimpleDate(var month: String, var day: Int = 0) {
    private val totalDaysInCurrentMonth: Int
        get() {
            return when (month) {
                "January", "March", "May", "July", "August", "October", "December" -> 31
                "April", "June", "September", "November" -> 30
                "February" -> 28 // note: leap years aren't taken into account here
                else -> 0
            }
        }

    fun advance() {
        // check for the end of the month
        if (day == totalDaysInCurrentMonth) {
            // check for the end of the year
            month = if (month == "December") {
                "January"
            } else {
                // increment the month
                months[months.indexOf(month) + 1]
            }
            // start over at the first day of the month
            day = 1
        } else {
            // it is not the end of the month, just increment the day
            day += 1
        }
    }
}

object MyMath {
    fun isEven(number: Int) = number % 2 == 0
    fun isOdd(number: Int) = number % 2 == 1
}

fun main() {
    val circle = Circle(5.0)
    println(circle.area)

    circle.grow(factor = 3.0)
    println(circle.area)
    println()

    val date = SimpleDate(month = "December", day = 31)
    date.advance()
    println(date.month) // December; should be January
    println(date.day) // 32; should be 1

    val date2 = SimpleDate(month = "February", day = 28)
    date2.advance()
    println(date2.month)
    println(date2.day)
    println()

    println(MyMath.isEven(42))
    println(MyMath.isOdd(42))
    println()

    fun Int.isEven() = this % 2 == 0
    fun Int.isOdd() = this % 2 == 1

    println(42.isEven())
    println(42.isOdd())
    println()

    fun Int.primeFactor(): List<Int> {
        var remainingValue = this
        var testFactor = 2
        val primes = mutableListOf<Int>()

        while (testFactor * testFactor <= remainingValue) {
            if (remainingValue % testFactor == 0) {
                primes.add(testFactor)
                remainingValue /= testFactor
            } else {
                testFactor += 1
            }
        }

        if (remainingValue > 1) {
            primes.add(remainingValue)
        }

        return primes
    }

    println(81.primeFactor())
}
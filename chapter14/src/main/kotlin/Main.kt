val months = arrayOf(
    "January", "February", "March",
    "April", "May", "June",
    "July", "August", "September",
    "October", "November", "December"
)

class SimpleDate1(var month: String)

fun monthsUntilWinterBreak(from: SimpleDate1): Int {
    return months.indexOf("December") - months.indexOf(from.month)
}

class SimpleDate2(private var month: String) {
    fun monthsUntilWinterBreak(from: SimpleDate2): Int {
        return months.indexOf("December") - months.indexOf(from.month)
    }
}

class SimpleDate3(private var month: String) {
//    fun monthsUntilWinterBreak(): Int {
//        return months.indexOf("December") - months.indexOf(this.month)
//    }
    val monthsUntilWinterBreak: Int
        get() = months.indexOf("December") - months.indexOf(this.month)
}

class MyMath {
    companion object {
        fun factorial(number: Int): Int {
            return (1..number).fold(1) { a, b -> a * b }
        }
        fun triangleNumber(number: Int): Int {
            return (1..number).fold(0) { a, b -> a + b }
        }
    }
}

class SimpleDate {
    var month: String = "January"

    fun monthsUntilWinterBreak(from: SimpleDate2): Int {
        return months.indexOf("December") - months.indexOf(this.month)
    }
}

fun SimpleDate.monthsUntilSummerBreak(): Int {
    return when (months.indexOf(month)) {
        in 0..months.indexOf("June") -> {
            months.indexOf("June") - months.indexOf(month)
        }
        in months.indexOf("June")..months.indexOf("August") -> {
            0
        }
        else -> {
            months.indexOf("June") + (12 - months.indexOf(month))
        }
    }
}

fun Int.abs(): Int {
    return if (this < 0) -this else this
}

fun MyMath.Companion.primeFactors(value: Int): List<Int> {
    var remainingValue = value

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

fun main() {
    val date2 = SimpleDate2("October")
    println(date2.monthsUntilWinterBreak(date2))

    val date3 = SimpleDate3("September")
//    println(date3.monthsUntilWinterBreak())
    println(date3.monthsUntilWinterBreak)

    println(MyMath.factorial(6))
    println(MyMath.triangleNumber(4))
    println()

    val date = SimpleDate()
    date.month = "December"
    println(date.monthsUntilSummerBreak())
    println()

    println(4.abs())
    println((-4).abs())
    println()

    println(MyMath.primeFactors(81))
}
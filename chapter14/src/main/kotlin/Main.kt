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

fun main() {
    val date2 = SimpleDate2("October")
    println(date2.monthsUntilWinterBreak(date2))

    val date3 = SimpleDate3("September")
//    println(date3.monthsUntilWinterBreak())
    println(date3.monthsUntilWinterBreak)

    println(MyMath.factorial(6))
    println(MyMath.triangleNumber(4)
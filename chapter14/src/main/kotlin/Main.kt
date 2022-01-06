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

class SimpleDate2(var month: String) {
    fun monthsUntilWinterBreak(from: SimpleDate2): Int {
        return months.indexOf("December") - months.indexOf(from.month)
    }
}

class SimpleDate3(var month: String) {
    fun monthsUntilWinterBreak(): Int {
        return months.indexOf("December") - months.indexOf(this.month)
    }
}

fun main() {
    val date2 = SimpleDate2("October")
    println(date2.monthsUntilWinterBreak(date2))

    val date3 = SimpleDate3("September")
    println(date3.monthsUntilWinterBreak())
}
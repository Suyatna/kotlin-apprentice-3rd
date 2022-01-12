fun main() {
    for (day in DayOfTheWeek.values()) {
        println("Day ${day.ordinal}: ${day.name}, is weekend: ${day.isWeekend}")
    }

    val dayIndex = 0
    val dayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("Day at $dayIndex is $dayAtIndex")

    val tuesday = DayOfTheWeek.valueOf("Tuesday")
    println("Tuesday is day ${tuesday.ordinal}")

    val today = DayOfTheWeek.today()
    val isWeekend = "It is ${if (today.isWeekend) "" else " not"} the weekend"
    val secondDay = DayOfTheWeek.Friday
    val daysUntil = today.daysUntil(secondDay)
    println("It is $today. $isWeekend. There are $daysUntil days until $secondDay")

    when (today) {
        DayOfTheWeek.Friday -> println("It's $today, I'm in love")
        else -> println("I'm tired of this warning about not all cases being handled")
    }
    println()

    /*
    Challenge 1

    Add a companion function to DayOfTheWeek which return a nullable
    DayOfTheWeek based on a passed-in index. Do the same for a passed-in string.
     */
    val dayAtIndex3 = DayOfTheWeek.forIndex(3)
    println("Day at index 3: $dayAtIndex3")

    val dayAtIndex7 = DayOfTheWeek.forIndex(7)
    println("Day at index 7: $dayAtIndex7")

    val thursdayString = "Thursday"
    val thursdayDay = DayOfTheWeek.forString(thursdayString)
    println("Day of the week for string \"$thursdayString\": $thursdayDay")

    val suyatnaDayString = "SuyatnaDay"
    val suyatnaDay = DayOfTheWeek.forString(suyatnaDayString)
    println("Day of the week for string \"$suyatnaDayString\": $suyatnaDay")
    println()

    /*
    Challenge 2

    Add a function to DayOfTheWeek to calculate how many days until the next weekend begins.
    Then, update your code so that the weekend is Wednesday and Thursday instead of Saturday and Sunday.
    Does it still work?
     */

    val firstWeekendDay = DayOfTheWeek.firstWeekendDay()
    val daysUntilWeekendFromWednesday = DayOfTheWeek.Wednesday.daysUntilWeekend()
    println("From Wednesday there are $daysUntilWeekendFromWednesday days until the weekend, " +
            "which starts on $firstWeekendDay")

    val daysUntilWeekendFromSaturday = DayOfTheWeek.Saturday.daysUntilWeekend()
    println("From Saturday there are $daysUntilWeekendFromSaturday days until the weekend, " +
            "which starts on $firstWeekendDay")
    println()
}
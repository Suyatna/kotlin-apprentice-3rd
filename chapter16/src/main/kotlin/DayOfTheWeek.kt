import java.util.*

enum class DayOfTheWeek(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(true),
    Sunday(true);

    fun daysUntil(other: DayOfTheWeek): Int {
        return if (this.ordinal < other.ordinal) {
            other.ordinal - this.ordinal
        } else {
            other.ordinal - this.ordinal + values().count()
        }
    }

    companion object {
        fun today(): DayOfTheWeek {
            val calendarDayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
            var adjustedDay = calendarDayOfWeek - 2
            val days = values()
            if (adjustedDay < 0) {
                adjustedDay += days.count()
            }

            return days.first { it.ordinal == adjustedDay }
        }
    }
}
fun main() {
    for (day in DayOfTheWeek.values()) {
        println("Day ${day.ordinal}: ${day.name}, is weekend: ${day.isWeekend}")
    }
    println()

    val dayIndex = 0
    val dayAtIndex = DayOfTheWeek.values()[dayIndex]
    println("Day at $dayIndex is $dayAtIndex")

    val tuesday = DayOfTheWeek.valueOf("Tuesday")
    println("Tuesday is day ${tuesday.ordinal}")
    println()

    val today = DayOfTheWeek.today()
    val isWeekend = "It is ${if (today.isWeekend) "" else "not"} the weekend"
    println("It is $today. $isWeekend")

    val secondDay = DayOfTheWeek.Tuesday
    val daysUntil = today.daysUntil(secondDay)
    println("It is $today. $isWeekend. There are $daysUntil days until $secondDay.")
    println()

    when (today) {
        DayOfTheWeek.Monday -> println("I don't care if $today's blue")
        DayOfTheWeek.Tuesday -> println("$today's gray")
        DayOfTheWeek.Wednesday -> println("And $today, too")
        DayOfTheWeek.Thursday -> println("$today, I don't care 'bout you")
        DayOfTheWeek.Friday -> println("It's $today, I'm in love")
        DayOfTheWeek.Saturday -> println("$today, wait...")
        DayOfTheWeek.Sunday -> println("$today always comes too late")
    }
    println()

    val currency = AcceptedCurrency.Crypto()
    println("You've got some ${currency.name}!")

    currency.amount = 0.27541f
    println("${currency.amount} of ${currency.name} is ${currency.totalValueInDollars()} in Dollars")
    println()

    Downloader().downloadData("foo.com/bar",
        progress = { downloadState ->
            when (downloadState) {
                null -> println("No download state yet")
                DownloadState.Starting -> println("Starting download...")
                DownloadState.InProgress -> println("Downloading data...")
                DownloadState.Error -> println("An error occurred. Download terminated.")
                DownloadState.Success -> println("Download completed successfully.")
            }
        },
        completion = { error, list ->
            error?.let { println("Got error: ${error.message}") }
            list?.let { println("Got list with ${list.size} items") }
        }
    )
}
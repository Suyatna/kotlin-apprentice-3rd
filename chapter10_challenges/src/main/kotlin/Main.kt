fun main() {
    // 1. repeating yourself
    // write a function that will run a given lambda a given number of times
    fun repeatTask(times: Int, task: () -> Unit) {
        for (time in 0 until times) {
            task()
        }
    }

    repeatTask(10) {
        println("kotlin apprentice book is great!")
    }
    println()

    // 2. lambda sums
    // write a function that you can reuse to create different mathematical sums
    // use the function to find the sum of the 10 square numbers, which equals 385
    // then use the function to find the sum of the 10 Fibonacci numbers, which equals 143
    fun mathSum(length: Int, series: (Int) -> Int): Int {
        var result = 0
        for (i in 0 until length) {
            result += series(i)
        }
        return result
    }

    println(mathSum(10) { it * it })

    fun fibonacci(number: Int): Int {
        if (number <= 0) return 0

        if (number == 1 || number == 2) return 1

        return fibonacci(number - 1) + fibonacci(number - 2)
    }

    println(mathSum(10, ::fibonacci))

    // 3. functional ratings
    // first, create a map called averageRatings which will contain a mapping of app name to average ratings
    // use forEach to iterate through the appRatings map
    // then, use reduce to calculate the average rating and store this rating in the averageRatings map
    // finally, use filter and map chained together to get a list of the app names whose average rating is greater than 3
    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialist" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

    val averageRatings = mutableMapOf<String, Double>()
    appRatings.forEach {
        val total = it.value.reduce(Int::plus)
        averageRatings[it.key] = total.toDouble() / it.value.size
    }
    println(averageRatings)

    val goodApps = averageRatings.filter {
        it.value > 3
    }.map {
        it.key
    }
    println(goodApps)
}
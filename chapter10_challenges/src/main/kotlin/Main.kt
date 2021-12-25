fun main() {
    // 1. repeating yourself
    // write a function that will run a given lambda a given number of times
    fun repeatTask(times: Int, task: () -> Unit) {
        for (time in 0 until times) {
            task()
        }
    }

    repeatTask(10, task = { println("kotlin apprentice book is great!") })
    println()

    // 2. lambda sums
    // write a function that you can reuse to create different mathematical sums
    // use the function to find the sum of the 10 square numbers, which equals 385
    // then use the function to find the sum of the 10 Fibonacci numbers, which equals 143
    fun mathSum(length: Int, series: (Int) -> Int): Int {

        return series(length)
    }

    val squareNumbers = mathSum(10, series = { a: Int ->
        var sum = 0
        for (i in 1 until a + 1) {
            sum += (i * i)
        }
        sum
    })

    println(squareNumbers)

    fun fibonacci(numbers: Int): Int {
        var sum = 0
        for (i in 1 until numbers + 1) {
            sum = when (i) {
                1 -> 1
                2 -> 1
                else -> {
                    fibonacci(numbers - 1) + fibonacci(numbers - 2)
                }
            }
        }
        return sum
    }

    val resultFibonacci = mathSum(10, series = { a: Int ->
        var total = 0
        for (i in 1 until a + 1) {
            total += fibonacci(i)
        }
        total
    })

    println(resultFibonacci)
}
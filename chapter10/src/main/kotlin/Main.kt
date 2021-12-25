fun main() {
    // declaration of variable that can hold a lambda:
    var multiplyLambda: (Int, Int) -> Int = { a: Int, b: Int -> Int
        a * b
    }
    println(multiplyLambda(3, 4))

    // shorthand syntax
    multiplyLambda = { a, b -> a * b}
    println(multiplyLambda(5, 7))

    // it keyword
    val doubleLambda: (Int) -> Int = { 2 * it }
    println(doubleLambda(10))

    val square: (Int) -> Int = { it * it }
    println(square(4))
    println()

    // lambda as arguments
    fun operateOnNumbers(
        a: Int,
        b: Int,
        operation: (Int, Int) -> Int
    ): Int {
        val result = operation(a, b)
        println(result)
        return result
    }

    val addLambda = { a: Int, b: Int ->
        a + b
    }
    operateOnNumbers(4, 2, operation = addLambda)

    fun addFunction(a: Int, b: Int) = a + b
    operateOnNumbers(4, 2, operation = ::addFunction)

    // define lambda inline
    operateOnNumbers(4, 2, operation = { a: Int, b: Int ->
        a + b
    })

    // simply lambda syntax and remove boilerplate, trailing lambda syntax
    operateOnNumbers(4, 2) { a, b -> a + b }

    // using + operator, the + operator is just an operator function plus() in the Int class
    // that takes two arguments and returns one result
    operateOnNumbers(4, 2, operation = Int::plus)
    println()

    // lambdas with no meaningful return value
    val unitLambda: () -> Unit = {
        println("kotlin apprentice is awesome!")
    }
    unitLambda()

    // lambda not return a value, must use the Nothing type
    val nothingLambda: () -> Nothing = {
        throw NullPointerException()
    }
    println()

    // capturing from the enclosing scope
    var counter = 0
    val incrementCounter = {
        counter += 1
    }

    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()
    incrementCounter()

    println(counter)
    println()

    fun countingLambda(): () -> Int {
        var counter = 0
        val incrementCounter: () -> Int = {
            counter += 1
            counter
        }
        return incrementCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1())
    println(counter2())
    println(counter1())
    println(counter1())
    println(counter2())
    println()

    // custom sorting with lambdas
    // call sorted() to get a sorted version of the array like so:
    val names = arrayOf("ZZZZZZ", "BB", "AAA", "CCCC", "EEEEE")
    println(names.sorted())

    // specify a trailing lambda for compareBy() like so:
    val namesByLength = names.sortedWith(compareBy {
        -it.length
    })
    println(namesByLength)

    // iterating over collections with lambdas
    // operation forEach function
    val values = listOf(1, 2, 3, 4, 5, 6)
    values.forEach {
        println("$it: ${it * it}")
    }
    println()

    // function to filter out certain elements
    val prices = listOf(1.5, 10.5, 4.99, 2.30, 8.19)
    val largePrices = prices.filter {
        it > 5.0
    }
    println(largePrices)

    val salesPrices = prices.map {
        it * 0.9
    }
    println(salesPrices)

    prices.forEach {
        print("${it * 0.9}, ")
    }
    println()
    println("original: $prices")

    // the map function can also be used to change the type
    val userInput = listOf("0", "11", "haha", "42")
    val numbers = userInput.map {
        it.toIntOrNull()
    }
    println(numbers)

    // if we want to filter out the invalid, null values
    val numbers2 = userInput.mapNotNull {
        it.toIntOrNull()
    }
    println(numbers2)
    println()

    // fold(), which takes a starting value and a lambda
    // this could be used with the prices list to calculate the total
    var sum = prices.fold(0.0) { a, b ->
        a + b
    }
    println(sum)

    // reduce is close related to fold(), reduce uses the first element in the collection as the starting value
    sum = prices.reduce { a, b ->
        a + b
    }
    println(sum)

    // calculate the total value of our stock
    val stock = mapOf(
        1.5 to 5,
        10.0 to 2,
        4.99 to 20,
        2.30 to 5,
        8.19 to 30
    )

    var stockSum = 0.0
    stock.forEach {
        stockSum += it.key * it.value
    }
    println(stockSum)
}
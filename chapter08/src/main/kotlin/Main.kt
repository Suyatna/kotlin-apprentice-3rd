@file:Suppress("KotlinConstantConditions")

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println()

    // Array
    // Creating Arrays
    // val evenNumber = arrayOf(2, 4, 6, 8)

    // Array With All Of Its Values Set To A Default
    // val fiveFive = Array(5, { 5 }) // 5 5 5 5 5

    // Array Of Primitive Types
    // arrayOf() -> Array<Int>, can correspond to array of primitive type.
    // val oddNumbers = intArrayOf(1, 3, 5, 7)

    // Other standard library functions include:
    // floatArrayOf(), doubleArrayOf(), booleanArrayOf().
    // Various functions: IntArray, FloatArray, DoubleArray, etc.

    // Pass a number into the constructor for these type, for example:
    // val zero = DoubleArray(4) // 0.0 0.0 0.0 0.0
    // Convert between the boxed and primitive arrays using function
    // val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()

    // Arguments To main()
//    for (arg in args) {
//        println(arg)
//    }

    args.forEach { arg ->
        println(arg)
    }
    println()

    // List
    // Creating Lists
    // val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    // val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    // An empty list
    // val subscribers: List<String> = listOf()

    // Put the type argument on the function
    // val subscribers = listOf<String>()

    // Mutable Lists
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val exoPlanets = mutableListOf<String>()
    exoPlanets.add("SigmaX")

    for (outerPlanet in outerPlanets) {
        print("$outerPlanet, ")
    }
    println()

    for (exoPlanet in exoPlanets) {
        print("$exoPlanet, ")
    }
    println()
    println()

    // Using Properties And Methods
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println(players.isEmpty())
    println()

    if (players.size < 2) {
        println("We need at least two players!")
    } else {
        println("Let's start!")
    }

    val currentPlayer = players.first()
    println(currentPlayer)
    println(players.last())
    println()

    val minPlayer = players.minOrNull()
    println("$minPlayer will start")
    println()

    // Using Indexing
    val firstPlayer = players[0]
    println("First player is $firstPlayer")

//    val secondPlayer = players.get(1)
//    println("Second player is $secondPlayer")

    // Using Range To Slice
    val upcomingPlayerSlice = players.slice(1..2)
    println(upcomingPlayerSlice.joinToString())
    println()

    println(isEliminated("Bob"))
    println(players.slice(1..3).contains("Alice")) // false
    println()

    // Modifying List
    // Appending Elements
    players.add("Eli")
    players += "Gina"
    println(players.joinToString())
    println()

    // Inserting Elements
    players.add(5, "Frank")

    // Removing Elements
    val wasPlayerRemoved = players.remove("Gina")
    println("It was $wasPlayerRemoved that Gine was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")
    println(players.indexOf("Dan"))

    // Updating Elements
    println(players.joinToString())
    players[4] = "Franklin"
    println(players.joinToString())
    println()

    players[3] = "Anna"
    players.sort()
    println(players.joinToString())
    println()

    // Iterating Through A List
    val scores = listOf(2, 2, 8, 6, 1)
    for ((index, player) in players.withIndex()) {
        println("${index + 1}. $player = ${scores[index]}")
    }
    println(sumOfElements(scores))
    println()

    // Nullability And Collection Types
    val nullableList: List<Int>? // = listOf(1, 2, 3, 4)
    nullableList = null
    println(nullableList)

    val listOfNullables: List<Int?> = listOf(1, 2, null, 4)
    println(listOfNullables)
}

val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
// Checking For An Element
fun isEliminated(player: String): Boolean {
    return player !in players
}

fun sumOfElements(list: List<Int>): Int {
    var sum = 0
    for (number in list) {
        sum += number
    }

    return sum
}
fun main() {
    // creating maps
    val namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println(namesAndScores)

    // create a map with define its capacity
    // var pairs = HashMap<String, Int>(20)

    // accessing values
    // using the index operator
    println(namesAndScores["Anna"])
}
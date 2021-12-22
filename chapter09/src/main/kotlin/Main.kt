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

    // using properties and methods
    // println(namesAndScores.get("Craig"))
    println(namesAndScores.isEmpty())
    println(namesAndScores.size)

    // modifying mutable maps
    // adding pairs
    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )

    bobData["state"] = "CA"
    bobData["city"] = "San Francisco"
    println(bobData)
    println()

    // mini-exercise
    fun playerAddress(players: MutableMap<String, String>): MutableMap<String, String?> {

        return mutableMapOf(
            "name" to players["name"],
            "city" to players["city"],
            "state" to players["state"]
        )
    }

    println(playerAddress(bobData))

    // updating values
    bobData["name"] = "Bobby" // Bob
    bobData["profession"] = "Mailman"

    val pair = "nickname" to "Bobby D"
    bobData += pair
    println(bobData)

    // removing pairs
    bobData.remove("city")
    bobData.remove("state", "CA")
    println(bobData)
    println()

    // iterating through maps
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }
    // iterate over just the keys
    for (player in namesAndScores.keys) {
        print("$player, ")
    }
    println()
    println()

    // running time for map operations
    println("some string".hashCode())
    println(1.hashCode())
    println(false.hashCode())
    println()

    // set
    // creating sets
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)

    // create an empty set by calling a constructor
    // val hashSet = HashSet<Int>()

    // set from arrays
    val someArray = arrayOf(1, 2, 3, 1)
    val someSet = mutableSetOf(*someArray)
    println(someSet)

    // accessing elements
    println(someSet.contains(1))
    // check for existence
    println(4 in someSet)
    // iterate through a set
    for (number in someSet) {
        println(number)
    }
    println()

    // adding and removing elements
}
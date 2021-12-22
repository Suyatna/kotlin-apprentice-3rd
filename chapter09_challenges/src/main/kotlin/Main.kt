fun main() {
    // challenges
    // 1. valid statements?
    // val map1: Map<Int to Int> = emptyMap() // type was wrong: Map<K, V>
    // val map2 = emptyMap() // not enough information: Map<K, V>
    val map3: Map<Int, Int> = emptyMap()

    val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    // map4[1] // type inference failed. the value of the type parameter K should be mentioned in input types (argument types, receiver type or expected type)
    map4["one"]
    // map4["Zero"] = 0 // no set method providing array access
    // map4[0] = "Zero" // unresolved reference. none of the following candidates is applicable because of receiver type mismatch

    val map5 = mutableMapOf(
        "NY" to "New York",
        "CA" to "California"
    )

    map5["NY"]
    map5["WA"] = "Washington"
    // map5["CA"] = null // null can not be a value of a non-null type TypeVariable(V)

    // 2. given a map with two-letter state codes as keys, and the full state names as values, write a function that
    // prints all the states with names longer than eight characters. for example, for the mapOf("NY" to "New York",
    // "CA" to "California"), the output would be California.
    fun longerFullSateName(states: Map<String, String>) {
        for (state in states) {
            if (state.value.length > 8) {
                println(state)
            }
        }
    }

    val americaStates = mapOf(
        "NY" to "New York",
        "CA" to "California"
    )
    longerFullSateName(americaStates)

    // 3. write a function that combines two maps into one. if a certain key appears in both maps, ignore the pair
    // from the first maps. this is the function's signature:
    fun mergeMaps(
        map1: Map<String, String>,
        map2: Map<String, String>
    ): Map<String, String> {

        val map3s: MutableMap<String, String> = mutableMapOf()
        map3s.putAll(map1)
        map3s.putAll(map2)
        return map3s
    }

    println(mergeMaps(map5, americaStates))

    // 4. declare a function occurrencesOfCharacters that calculates which characters occur in a string, as well
    // as how often each of these characters occur. return the result as a map. this is the function signature:
    fun occurrencesOfCharacters(text: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (i in text) {
            val count = map.getOrDefault(i, defaultValue = 0)
            map[i] = count + 1
        }
        return map
    }
    println(occurrencesOfCharacters("suyatna"))

    // 5. write a function that returns true if all the values of a map are unique. use a set to test uniqueness.
    fun isInvertible(map: Map<String, Int>) = map.values.toSet().size == map.values.size

    val invertibleMap = mapOf("1" to 1, "2" to 2, "3" to 3)
    println(isInvertible(invertibleMap))

    val nonInvertibleMap = mapOf("1" to 3, "2" to 2, "3" to 3)
    println(isInvertible(nonInvertibleMap))

    // 6. given the map:
    val nameTitleLookup: MutableMap<String, String?> = mutableMapOf(
        "Mary" to "Engineer",
        "Patrick" to "Intern",
        "Ray" to "Hacker"
    )

    nameTitleLookup["Patrick"] = null
    nameTitleLookup.remove("Ray")

    println(nameTitleLookup)

}
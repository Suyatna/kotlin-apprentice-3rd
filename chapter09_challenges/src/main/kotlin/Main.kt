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

        return (map1.asSequence() + map2.asSequence())
            .distinct()
            .groupBy({ it.key }, { it.value })
            .mapValues { (_, values) -> values.joinToString(",") }
    }

    println(mergeMaps(map5, americaStates))
}
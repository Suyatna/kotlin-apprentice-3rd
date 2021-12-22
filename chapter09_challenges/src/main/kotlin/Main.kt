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
}
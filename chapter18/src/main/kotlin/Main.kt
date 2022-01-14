fun <T> List<T>.toBulletedList(): String {
    val separator = "\n - "
    return this.joinToString(separator, prefix = separator, postfix = "\n") { "$it" }
}

fun main() {
    val names = listOf("Bob", "Carol", "Ted", "Alice")
    println("Names: $names")
    val firstName = names.first()
    println(firstName)
    println()

    val things= mutableListOf<Any>(1, 2)
    things.add("Steve")
    println("Things: ${things.toBulletedList()}")
    println()

    val map = mapOf(
        Pair("one", 1),
        Pair("two", "II"),
        Pair("three", 3.0f)
    )

    val valuesForKeysWithE = map.keys
        .filter { it.contains("e") }
        .map { "Value for $it: ${map[it]}" }
    println("Values for keys with E: ${valuesForKeysWithE.toBulletedList()}")
    println()

    println("Names: ${names.toBulletedList()}")
}
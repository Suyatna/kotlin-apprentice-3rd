fun main() {
    val albert = Student(
        firstName = "Albert",
        lastName = "Einstein",
        id = 1
    )
    val richard = Student(
        firstName = "Richard",
        lastName = "Feynman",
        id = 2
    )
    val albertCopy = albert.copy()

    println(albert)
    // > Student (firstName=Albert, lastName=Einstein, id=1)
    println(richard)
    // > Student (firstName=Richard, lastName=Feynman, id=2)

    println(albert == richard) // > false
    println(albert == albertCopy) // > true
    println(albert === albertCopy) // > false
    println()

    val marie = StudentData("Marie", "Curie", id = 1)
    val emmy = StudentData("Emmy", "Noether", id = 2)
    val marieCopy = marie.copy()

    println(marie)
    println(emmy)

    println(marie == emmy)
    println(marie == marieCopy)
    println(marie === marieCopy)
    println()

    // destructing declaration
    val (firstName, lastName, id) = marie
    println(firstName)
    println(lastName)
    println(id)
}
import `interface`.PersonWithName
import person.Classmate
import person.Relative

fun <T: PersonWithName> List<T>.printNames() {
    forEach { println("${it.firstName} ${it.lastName}") }
}

fun main() {
    /*
    Challenge 1

    Use generics to create a function that can print full names of a list of people as long as
    the objects representing them conform to a certain interface. The interface should
    allow you to access `String` values for firstName and lastName. Start with members
    of your family and your peers (or use fictional family members or peers if you'd prefer).
     */
    val family = listOf(
        Relative("Homer", "Simpson","Father"),
        Relative("Marge", "Simpson", "Mother"),
        Relative("Bart", "Simpson", "Brother"),
        Relative("Maggie", "Simpson", "Sister")
    )
    println("Family:")
    family.printNames()
    println()

    val classmate = listOf(
        Classmate("Ralph", "Wolf"),
        Classmate("Janey", "Powell"),
        Classmate("Sherri", "Blueberry"),
        Classmate("Terri", "Blueberry")
    )
    println("Classmate:")
    classmate.printNames()
    println()
}
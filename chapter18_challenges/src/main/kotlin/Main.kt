import `interface`.PersonWithName
import person.Classmate
import person.Relative
import vehicle.Vehicle

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

    /*
    Challenge 2

    Create a `Vehicle` class that conforms to `Checkable` class and a `ShippingContainer` class
    that conforms to Container<Vehicle>, but that which only takes one vehicle at a time. Each vehicle should:
    a)  Know its own height in inches.
    b)  Know its model and brand names.
    c)  Display a combination of its model and brand names instead of its INSTANCE ADDRESS
        when printed out using println().
    d)  Have a variable for a lambda, which allows callers to verify if the vehicle's height,
        in inches, is too big for a Mover's truck by passing in the height of the vehicle to the lambda,
        then returning a Boolean value from the lambda of whether it will fill.
        (Hint: You can't do this as part of a constructor, since you won't have a reference to the Mover yet).
    e)  Use that function as part of `checkIsOk()`.
     */

    val vehicle = listOf(
        Vehicle("Yamaha", "Vino", 40),
        Vehicle("Toyota", "Corolla", 58),
        Vehicle("Freighter", "Cascade", 150)
    )

    // TODO: Add Interface Mover
}
import `interface`.PersonWithName
import mover.Mover
import person.Classmate
import person.Relative
import vehicle.ShippingContainer
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
    d)  Have a VARIABLE FOR A LAMBDA, which allows callers to verify if the vehicle's height,
        in inches, is too big for a MOVER'S TRUCK by passing in the height of the vehicle to the lambda,
        then returning a Boolean value from the lambda of whether it will fill.
        (Hint: You can't do this as part of a constructor, since you won't have a reference to the MOVER yet).
    e)  Use that function as part of `checkIsOk()`.
     */

    /*
    Challenge 3

    Use the default constructor of `Mover<Vehicle>` and the functions you've already used to try to move three
    vehicles in `ShippingContainers` : A Yamaha Vino, which is 40 inches tall; a Toyota Corolla, which is
    58 inches tall; and a Freighter Cascade, which is 150 inches tall. After doing that, answer the following questions:
    a)  How many of your vehicle does a mover--who is created using the default values--move?
    b)  Do you need to adjust the height of the moving vehicle in order to get all the vehicles to be moved?
        If so, what is the height it needs to be adjusted to?
     */
    val vehicles = listOf(
        Vehicle("Yamaha", "Vino", 40),
        Vehicle("Toyota", "Corolla", 58),
        Vehicle("Freighter", "Cascade", 150)
    )

    val vehicleMover = Mover(vehicles)

    vehicles.forEach { it.heightCheckFunction = vehicleMover::fitsInTruck }

    vehicleMover.moveEverythingToTruck(ShippingContainer())
    vehicleMover.moveEverythingIntoNewPlace()
    vehicleMover.finishMove()

    /*
    Challenge 4

    Create a `Mover` object that can move all the vehicle, `BreakableThing` and `CheapThing` objects
    you've already created.
    a)  What is the type you need to pass to create a mover who can move all of these types of things?
    b)  Is there a kind of `Container` you can pass to this mover? If there is, what kind is it?
     */
}
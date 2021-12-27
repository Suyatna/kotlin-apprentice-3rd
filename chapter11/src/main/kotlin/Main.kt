import java.util.*

fun main() {
    val yatna = Person(firstName = "Suyatna", lastName = "Light")
    println(yatna.fullName)

    var homeOwner = yatna
    yatna.firstName = "Yatna"

    println(yatna.firstName)
    println(homeOwner.firstName)

    // mini-exercises
    // change the value of lastName on homeOwner, then try reading fullName on both yatna and homeOwner
    homeOwner.lastName = "Rider"
    println(yatna.fullName)
    println(homeOwner.fullName)

    // object identity
    println("homeOwner === yatna: ${homeOwner === yatna}")
    println()

    val impostorYatna = Person(firstName = "Yatna", lastName = "Light")
    println("""val impostorYatna = Person(firstName = "Yatna", lastName = "Light")""")
    println("yatna === homeOwner: ${yatna === homeOwner}")
    println("yatna === impostorYatna: ${yatna === impostorYatna}")
    println("impostorYatna === homeOwner: ${impostorYatna === homeOwner}")
    println()

    // assigment of existing variables changes the instances the variables reference
    homeOwner = impostorYatna
    println("yatna === homeOwner: ${yatna === homeOwner}")

    homeOwner = yatna
    println("yatna === homeOwner: ${yatna === homeOwner}")
    println()

    // create fake, impostor yatna
    val imposters = (0..100).map {
        Person(firstName = "Yatna", lastName = "Light")
    }

    // equality (==) is not effective when Yatna cannot be identified by his name alone
    println(imposters.map {
        it.firstName == "Yatna" && it.lastName == "Light"
    }.contains(true))

    // check to ensure the real Yatna is not found among the imposters
    println("imposters.contains(yatna): ${imposters.contains(yatna)}")
    println()

    // now hide the "real" Yatna somewhere among the imposters
    val mutableImposters = mutableListOf<Person>()
    mutableImposters.addAll(imposters)
    mutableImposters.contains(yatna)
    println("mutableImposters.contains(yatna) [0]: ${mutableImposters.contains(yatna)}")
    mutableImposters.add(Random().nextInt(5), yatna)

    // Yatna can now be found among the imposters
    println("mutableImposters.contains(yatna) [1]: ${mutableImposters.contains(yatna)}")
    println()

    // since `Person` is reference type, we can use === to grab the real Yatna out of the list of imposters
    // and modify the value. the original `yatna` variable will print the new last name!
    val indexOfYatna = mutableImposters.indexOf(yatna)
    if (indexOfYatna != -1) {
        mutableImposters[indexOfYatna].lastName = "Banana"
    }

    println(yatna.fullName)
    println()

    // mini-exercises
    fun memberOf(person: Person, group: Array<Person>): Boolean {
        return group.contains(person)
    }

    val groupWithJohn = arrayOf(
        Person("A", "B"),
        Person("C", "D"),
        yatna,
        Person("E", "F"),
        Person("G", "H")
    )

    val groupWithoutJohn = arrayOf(
        Person("A", "B"),
        Person("C", "D"),
        Person("E", "F"),
        Person("G", "H"),
        Person("I", "J")
    )

    println(memberOf(yatna, groupWithJohn)) // > true
    println(memberOf(yatna, groupWithoutJohn)) // > false
    println()
}

// creating classes
class Person(var firstName: String, var lastName: String) {
    val fullName
        get() = "$firstName $lastName"
}
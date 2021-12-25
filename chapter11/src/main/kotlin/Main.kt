fun main() {
    val yatna = Person(firstName = "Suyatna", lastName = "Light")
    println(yatna.fullName)
}

// creating classes
class Person(var firstName: String, var lastName: String) {
    val fullName
        get() = "$firstName $lastName"
}
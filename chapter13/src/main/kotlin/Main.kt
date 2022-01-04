fun main() {
    val contact = Contact("Grace Murray", "grace@navy.mil")

    val name = contact.fullName
    val email = contact.emailAddress

    contact.fullName = "Grace Hopper"
    val grace = contact.fullName

    println("$name, $email")
    println(grace)
    println()

    var contact2 = Contact2(
        fullName = "Grace Murray",
        emailAddress = "grace@navy.mil"
    )

    // error: val cannot be reassigned
    // contact2.emailAddress = "grace@gmail.com"
    println("${contact2.fullName}, ${contact2.emailAddress}")
    println()

    var contact3 = Contact3(
        fullName = "Grace Murray",
        emailAddress = "grace@navy.mil"
    )
    println("${contact3.fullName}, ${contact3.emailAddress}, ${contact3.type}")

    contact3.type = "Work"
    println("${contact3.fullName}, ${contact3.emailAddress}, ${contact3.type}")
    println()

    val person = Person("Grace", "Hopper")
    println(person.fullName)

    val address = Address()
}
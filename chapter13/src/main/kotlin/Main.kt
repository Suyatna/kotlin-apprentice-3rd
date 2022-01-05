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
    println()

    val address = Address()

    val tv = TV(height = 53.93, width = 95.87)
    val size = tv.diagonal
    println(size)

    tv.width = tv.height
    val diagonal = tv.diagonal
    println(diagonal)

    tv.diagonal = 70
    println(tv.height)
    println(tv.width)
    println()

    val level1 = Level(id = 1, boss = "Chameleon", unlocked = true)
    val level2 = Level(id = 2, boss = "Squid", unlocked = false)
    val level3 = Level(id = 3, boss = "Chupacabra", unlocked = false)
    val level4 = Level(id = 4, boss = "Yeti", unlocked = false)

    // error: unresolved reference
    // can't access members of the companion object on an instance
    // val highestLevel = level3.highestLevel

    val highestLevel = Level.highestLevel // 1

    val delegatedLevel1 = DelegatedLevel(id = 1, boss = "Chameleon")
    val delegatedLevel2 = DelegatedLevel(id = 2, boss = "Squid")

    println(DelegatedLevel.highestLevel)

    delegatedLevel2.unlocked = true

    println(DelegatedLevel.highestLevel)
    println()

    val light = LightBulb()
    light.current = 50
    var current = light.current // 0
    println(current)
    light.current = 40
    current = light.current // 40
    println(current)
}
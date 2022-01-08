fun main() {
    val john = Person(firstName = "Johnny", lastName = "Appleseed")
    val jane = Student(firstName = "Jane", lastName = "Appleseed")

    println(john.fullName())
    println(jane.fullName())

    val history = Grade(letter = 'B', points = 9.0, credits = 3.0)
    jane.recordGrade(history)
    // john.recordGrade(history) // john not a student!

    println("Jane: ${jane.grades}")
    println()

    fun phonebookName(person: Person): String {
        return "${person.lastName}, ${person.firstName}"
    }

    val person = Person(
        firstName = "Johnny",
        lastName = "Appleseed"
    )
    val oboePlayer = OboePlayer(
        firstName = "Jane",
        lastName = "Appleseed"
    )

    println(phonebookName(person))
    println(phonebookName(oboePlayer))
    println()

    var hallMonitor = Student(firstName = "Jill", lastName = "Banana")
    hallMonitor = oboePlayer

    println(hallMonitor is OboePlayer) // true, since assigned it to oboePlayer
    println(hallMonitor !is OboePlayer) // also have !is for "not-is"
    println(hallMonitor is Person) // true, because Person is ancestor of OboePlayer
    println()

    // (oboePlayer as Student).minimumPracticeTime // error: no longer a band member!
    println((hallMonitor as? BandMember)?.minimumPracticeTime) // 4 if hallMonitor = oboePlayer, else null
    println()

    fun afterClassActivity(student: Student): String {
        return "Goes home!"
    }

    fun afterClassActivity(student: BandMember): String {
        return "Goes to practice!"
    }

    println(afterClassActivity(oboePlayer))
    println(afterClassActivity(oboePlayer as Student))
}
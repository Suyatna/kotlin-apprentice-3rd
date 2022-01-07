fun main() {
    val john = Person(firstName = "Johnny", lastName = "Appleseed")
    val jane = Student(firstName = "Jane", lastName = "Appleseed")

    println(john.fullName())
    println(jane.fullName())

    val history = Grade(letter = 'B', points = 9.0, credits = 3.0)
    jane.recordGrade(history)
    // john.recordGrade(history) // john not a student!

    println("Jane: ${jane.grades}")
}
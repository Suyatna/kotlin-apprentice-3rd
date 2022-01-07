open class Student(
    firstName: String,
    lastName: String,
    var grades: MutableList<Grade> = mutableListOf()
) : Person(firstName, lastName) {
    open fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

open class BandMember(
    firstName: String,
    lastName: String
) : Student(firstName, lastName) {
    open val minimumPracticeTime: Int
        get() = 2
}

class OboePlayer(
    firstName: String,
    lastName: String
) : BandMember(firstName, lastName) {
    override val minimumPracticeTime: Int =
        super.minimumPracticeTime * 2
}
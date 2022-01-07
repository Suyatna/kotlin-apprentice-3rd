class Student(
    firstName: String,
    lastName: String,
    var grades: MutableList<Grade> = mutableListOf()
): Person(firstName, lastName) {
    fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}
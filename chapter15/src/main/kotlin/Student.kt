class Student(
    var firstName: String,
    var lastName: String,
    var grades: MutableList<Grade> = mutableListOf()
) {
    fun recordGrace(grade: Grade) {
        grades.add(grade)
    }
}
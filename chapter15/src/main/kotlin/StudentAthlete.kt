class StudentAthlete(
    firstName: String,
    lastName: String
) : Student(firstName, lastName) {
    val failedClasses = mutableListOf<Grade>()

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)

        if (grade.letter == 'F') {
            failedClasses.add(grade)
        }
    }

    val isEligible: Boolean
        get() = failedClasses.size < 3
}
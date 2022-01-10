class StudentAthlete(
    firstName: String,
    lastName: String
) : Student(firstName, lastName) {
    private var failedClasses = mutableListOf<Grade>()

    override fun recordGrade(grade: Grade) {
        super.recordGrade(grade)

        var newFailedClasses = mutableListOf<Grade>()

        for (grade in grades) {
            if (grade.letter == 'F') {
                newFailedClasses.add(grade)
            }
        }
        failedClasses = newFailedClasses
    }

    val isEligible: Boolean
        get() = failedClasses.size < 3
}
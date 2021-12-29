data class Student(
    val id: Int,
    val firstName: String,
    val lastName: String
) {
    var fullName = "$firstName $lastName"

    companion object {
        private var counter = 0

        fun numberOfStudent() = counter
    }

    init {
        counter++
    }
}

object StudentRegistry {
    private val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }

    fun listAllStudents() {
        allStudents.forEach {
            println(it.fullName)
        }
    }
}

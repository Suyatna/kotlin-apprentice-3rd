class Student(
    var firstName: String,
    var lastName: String,
    var id: Int
) {
    // suppose we want to define a Student class and have added functionality,
    // such as the ability to compare whether two students are equal in value or
    // the ability to easily print the student data.

    override fun hashCode(): Int {
        val prime = 31
        var result = 1

        result = prime * result + firstName.hashCode()
        result = prime * result + id
        result = prime * result + lastName.hashCode()

        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other == null) return false

        if (javaClass != other.javaClass) return false

        val obj = other as Student?

        if (firstName != obj?.firstName) return false

        if (id != obj.id) return false

        if (lastName != obj.lastName) return false

        return true
    }

    override fun toString(): String {
        return "student (firstName=$firstName, lastname=$lastName, id=$id)"
    }

    fun copy(
        firstName: String = this.firstName,
        lastName: String = this.lastName,
        id: Int = this.id
    ) = Student(firstName, lastName, id)
}
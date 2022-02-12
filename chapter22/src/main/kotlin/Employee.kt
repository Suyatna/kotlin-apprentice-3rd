data class Employee(
    val company: Company,
    val name: String,
    var salary: Int
) : Comparable<Employee> {
    operator fun inc(): Employee {
        salary += 5000
        println("$name got a raise to $$salary")
        return this
    }

    operator fun dec(): Employee {
        salary -= 5000
        println("$name's salary decreased to $$salary")
        return this
    }

    operator fun plusAssign(increasingSalary: Int) {
        salary += increasingSalary
        println("$name got raised to $$salary")
    }

    operator fun minusAssign(decreaseSalary: Int) {
        salary -= decreaseSalary
        println("$name's salary decreased to $$salary")
    }

    operator fun rangeTo(other: Employee): List<Employee> {
        val currentIndex = company.allEmployees.indexOf(this)
        val otherIndex = company.allEmployees.indexOf(other)

        // start index cannot be large or equal to the end index
        if (currentIndex >= otherIndex) {
            return emptyList()
        }

        // get all elements in a list from currentIndex to otherIndex
        return company.allEmployees.slice(currentIndex..otherIndex)
    }

    override fun compareTo(other: Employee): Int {
        return when (other) {
            this -> 0
            else -> name.compareTo(other.name)
        }
    }
}
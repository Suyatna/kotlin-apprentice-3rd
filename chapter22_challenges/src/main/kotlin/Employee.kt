data class Employee(
    val company: Company,
    val name: String,
    var salary: Int
) : Comparable<Employee> {

    operator fun plusAssign(increaseSalary: Int) {
        salary += increaseSalary
        println("$name got a rise to $$salary")
    }

    operator fun minusAssign(decreaseSalary: Int) {
        salary -= decreaseSalary
        println("$name's salary decreased to $$salary")
    }

    operator fun plus(employee: Employee): List<Employee> {
        return listOf(this, employee)
    }

    operator fun dec(): Employee {
        salary -= 5000
        println("$name's salary decreased to $$salary")
        return this
    }

    operator fun inc(): Employee {
        salary += 5000
        println("$name got raise to $$salary")
        return this
    }

    operator fun rangeTo(other: Employee): List<Employee> {
        TODO("Not yet implemented")
    }

    override fun compareTo(other: Employee): Int {
        return when (other) {
            this -> 0
            else -> name.compareTo(other.name)
        }
    }

}

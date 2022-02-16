class Company {
    private val departments: ArrayList<Department> = arrayListOf()

    val allEmployees: List<Employee>
        get() = arrayListOf<Employee>().apply {
            departments.forEach { addAll(it.employees) }
            sort()
        }

    operator fun plusAssign(department: Department) {
        departments.add(department)
    }

    operator fun minusAssign(department: Department) {
        departments.remove(department)
    }
}
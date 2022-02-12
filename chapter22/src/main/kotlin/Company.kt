class Company(val name: String) {
    private val departments: ArrayList<Department> = arrayListOf()

    operator fun plusAssign(department: Department) {
        departments.add(department)
    }

    operator fun minusAssign(department: Department) {
        departments.remove(department)
    }
}
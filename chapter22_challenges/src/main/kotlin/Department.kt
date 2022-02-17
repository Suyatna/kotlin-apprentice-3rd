class Department(val name: String) : Iterable<Employee> {

    val employees: ArrayList<Employee> = arrayListOf()

    override fun iterator(): Iterator<Employee> {
        TODO("Not yet implemented")
    }
}
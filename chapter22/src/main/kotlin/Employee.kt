class Employee(
    val company: Company,
    val name: String,
    var salary: Int
) {
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
}
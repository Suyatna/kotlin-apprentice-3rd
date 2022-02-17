fun main() {
    val company = Company("MyOwnCompany")

    val developmentDepartment = Department("Development")
    val qaDepartment = Department("Quality Assurance")
    val hrDepartment = Department("Human Resource")

    var julia = Employee(company, "Julia", 100_000)
    val john = Employee(company, "John", 86_000)
    var peter = Employee(company, "Peter", 100_000)

    val sandra = Employee(company, "Sandra", 75_000)
    val thomas = Employee(company, "Thomas", 73_000)
    val alice = Employee(company, "Alice", 70_000)

    val bernadette = Employee(company, "Bernadette", 66_000)
    val mark = Employee(company, "Mark", 66_000)

    company += developmentDepartment
    company += qaDepartment
    company += hrDepartment

    developmentDepartment.hire(julia + john + peter)

    qaDepartment.hire(sandra + thomas + alice)

    hrDepartment.hire(bernadette + mark)

    qaDepartment -= thomas

    if (thomas !in qaDepartment) {
        println("${thomas.name} no longer works here")
    }

    ++julia
    --peter

    mark += 2500
    alice -= 2000

    println((alice..mark).joinToString { it.name })

    qaDepartment[0]?.plusAssign(1000)
    qaDepartment[1] = thomas
}
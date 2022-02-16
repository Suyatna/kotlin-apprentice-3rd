fun main() {
    val company = Company()

    val developmentDepartment = Department("Development")
    val qaDepartment = Department("Quality Assurance")
    val hrDepartment = Department("Human Resources")

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

    developmentDepartment += julia
    developmentDepartment += john
    developmentDepartment += peter

    qaDepartment += sandra
    qaDepartment += thomas
    qaDepartment += alice

    hrDepartment += bernadette
    hrDepartment += mark

    qaDepartment -= thomas

    ++julia // now Julia's salary is 105_000
    --peter // now Peter's salary is 95_000

    mark += 2500
    alice -= 2500

    println()

    if (thomas !in qaDepartment) {
        println("${thomas.name} no longer works here")
    }

    println()

    print((alice..mark).joinToString { it.name })
}
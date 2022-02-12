fun main() {
    val company = Company("MyOwnCompany")

    val developmentDepartment = Department("Development")
    val qaDepartment = Department("Quality Assurance")
    val hrDepartment = Department("Human Resources")

    var Julia = Employee(company, "Julia", 100_000)
    var John = Employee(company, "John", 86_000)
    var Peter = Employee(company, "Peter", 100_000)

    var Sandra = Employee(company, "Sandra", 75_000)
    var Thomas = Employee(company, "Thomas", 73_000)
    var Alice = Employee(company, "Alice", 70_000)

    var Bernadette = Employee(company, "Bernadette", 66_000)
    var Mark = Employee(company, "Mark", 66_000)

    company += developmentDepartment
    company += qaDepartment
    company += hrDepartment

    developmentDepartment += Julia
    developmentDepartment += John
    developmentDepartment += Peter

    qaDepartment += Sandra
    qaDepartment += Thomas
    qaDepartment += Alice

    hrDepartment += Bernadette
    hrDepartment += Mark

    qaDepartment -= Thomas

    ++Julia // now Julia's salary is 105_000
    --Peter // now Peter's salary is 95_000

    Mark += 2500
    Alice -= 2500

    println()

    val firstEmployee = qaDepartment[0]
    firstEmployee
    qaDepartment[0]?.plusAssign(1000)

    qaDepartment[1] = Thomas

    if (Thomas !in qaDepartment) {
        println("${Thomas.name} no longer works here")
    }
}
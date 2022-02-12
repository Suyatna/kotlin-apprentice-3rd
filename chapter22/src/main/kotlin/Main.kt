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
}
fun main() {

    val user = User()

    user.firstName = "Bob"
    user.lastName = "Parker"

    println("User info:\n$user")

    val billingAddress = Address(
        "123 Fake Street",
        "4th Floor",
        "Los Angeles",
        "CA",
        "90291",
        AddressType.Billing
    )

    println("Billing Address:\n$billingAddress")
}
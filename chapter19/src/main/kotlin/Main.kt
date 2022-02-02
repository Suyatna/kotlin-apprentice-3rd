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

    user.addOrUpdateAddress(billingAddress)

    val shippingAddress = Address(
        "987 Unreal Driver",
        null,
        "Burbank",
        "CA",
        "91523",
        AddressType.Shipping
    )

    user.addOrUpdateAddress(shippingAddress)

    println("User info after adding addresses:\n$user")

    println("Shipping Label:")
    printLabelFor(user)

    val anotherUser = User()
//    anotherUser.addresses = null
    println("Another User has ${anotherUser.addresses.count()} addresses")

    println("Another User first name: ${anotherUser.firstName ?: "(not set)"}")

    println("Sample First Line: ${Address.sampleFirstLine}")

    println("Sample Canadian Address:\n${Address.canadianSample(AddressType.Billing)}")
}
import java.util.*

enum class AddressType {
    Billing,
    Shipping,
    Gift
}

data class Address(
    val streetLine1: String,
    val streetLine2: String?,
    val city: String,
    val stateOrProvince: String,
    val postalCode: String,
    var addressType: AddressType,
    val country: String = "United States"
) {
    fun forPostalLabel(): String {
        var printedAddress = streetLine1
        streetLine2?.let { printedAddress += "\n$it" }
        printedAddress += "\n$city, $stateOrProvince $postalCode"
        printedAddress += "\n${country.uppercase(Locale.getDefault())}"
        return printedAddress
    }

    override fun toString(): String {
        return forPostalLabel()
    }
}
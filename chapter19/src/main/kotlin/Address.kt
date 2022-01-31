import java.util.*

enum class AddressType {
    Billing,
    Shipping,
    Gift
}

data class Address @JvmOverloads constructor(
    @JvmField val streetLine1: String,
    @JvmField val streetLine2: String?,
    @JvmField val city: String,
    @JvmField val stateOrProvince: String,
    @JvmField val postalCode: String,
    @JvmField var addressType: AddressType,
    @JvmField val country: String = "United States"
) {
    fun forPostalLabel(): String {
        var printedAddress = streetLine1
        streetLine2?.let { printedAddress += "\n$it" }
        printedAddress += "\n$city, $stateOrProvince $postalCode"
        printedAddress += "\n${country.uppercase(Locale.getDefault())}"
        return printedAddress
    }

    object JSONKeys {
        const val streetLine1 = "street_1"
        const val streetLine2 = "street_2"
        const val city = "city"
        const val stateOrProvince = "state"
        const val postalCode = "zip"
        const val addressType = "type"
        const val country = "country"
    }

    override fun toString(): String {
        return forPostalLabel()
    }
}
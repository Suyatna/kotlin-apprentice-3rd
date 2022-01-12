sealed class AcceptedCurrency {
    abstract val valueInDollars: Float
    var amount: Float = 0.0f

    class Dollar: AcceptedCurrency() {
        override val valueInDollars = 1.0f
    }
    class Euro: AcceptedCurrency() {
        override val valueInDollars = 1.25f
    }
    class Crypto: AcceptedCurrency() {
        override val valueInDollars = 2534.92f
    }
    // leave the existing name property alone

    val name: String
        get() = when (this) {
            is Euro -> "Euro"
            is Dollar -> "Dollars"
            is Crypto -> "NerdCoin"
        }

    fun totalValueInDollars(): Float {
        return amount * valueInDollars
    }
}

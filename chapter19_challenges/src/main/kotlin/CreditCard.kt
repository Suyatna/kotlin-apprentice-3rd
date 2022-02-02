import java.util.*

// 1
data class CreditCard @JvmOverloads constructor(
    // 3
    @JvmField val cardNumber: String,
    @JvmField val expirationMonth: Int,
    @JvmField val expirationYear: Int,
    @JvmField val cvv: String? = null
) {
    // 5
    companion object {
        @JvmStatic
        fun isValidExpirationDate(expirationMonth: Int, expirationYear: Int): Boolean {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)

            return if (expirationYear > currentYear) {
                true
            } else if (expirationYear < currentYear) {
                false
            } else {
                val currentMonth = Calendar.getInstance().get(Calendar.MONTH)
                val nonZeroIndexedMonth = currentMonth + 1
                nonZeroIndexedMonth >= expirationMonth
            }
        }
    }

    // 2
    override operator fun equals(other: Any?): Boolean {
        val otherCard = other as? CreditCard

        return if (otherCard != null) {
            (this.cardNumber == otherCard.cardNumber
                    && this.expirationYear == otherCard.expirationYear
                    && this.expirationMonth == otherCard.expirationMonth)
        } else {
            false
        }
    }
}
fun main() {
    val isGood = CreditCard.isValidExpirationDate(6, 2030)
    println("Expiration date is: ${if (isGood) "valid" else "invalid"}")
}
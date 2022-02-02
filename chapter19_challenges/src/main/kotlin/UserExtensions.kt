// 6
@file:JvmName("UserExtensions")

fun User.attemptToAddCard(card: CreditCard) {
    // 6.a
    val existing = creditCards.firstOrNull { it == card }

    if (existing != null) {
        println("Card already exists")
        return
    }

    // 6.b
    if (!CreditCard.isValidExpirationDate(card.expirationMonth, card.expirationYear)) {
        println("Invalid expiration")
        return
    }

    // 7
    creditCards.add(card)
}
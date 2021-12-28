class ShoppingCart(private val items: List<TShirt>, private val address: Address) {
    private var total = 0

    fun totalCost() {
        for (item in items) {
            total += item.price
        }
        println("total: $total")
        println("shipping to: ${address.name}, ${address.street}, ${address.city}, ${address.zip}")
    }
}
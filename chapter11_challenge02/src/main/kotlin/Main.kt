fun main() {
    val listTShirt: MutableList<TShirt> = mutableListOf()
    val torso = TShirt(35, "blue", 150_000)
    val shiningBright = TShirt(34, "black", 120_000, true)
    listTShirt.add(torso)
    listTShirt.add(shiningBright)

    val address = Address("household inn", "st. lois", "queens", "14045")
    val suyatna = User("suyatna", "zuyatna@email.com", ShoppingCart(listTShirt, address))
    suyatna.shoppingCart.totalCost()
}
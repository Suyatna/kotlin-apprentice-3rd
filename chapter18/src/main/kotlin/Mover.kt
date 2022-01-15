class Mover<T>(
    thingsToMove: List<T>,
    val truckHeightInInches: Int = (12 * 12)
) {
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    fun moveEverythingIntoTruck() {
        while (thingsLeftInOldPlace.isNotEmpty()) {
            val item = thingsLeftInOldPlace.removeAt(0)

            if (item is BreakableThing) {
                if (!item.isBroken) {
                    thingsInTruck.add(item)
                    println("Move your $item to the truck")
                } else {
                    println("Could not move your $item to the truck")
                }
            } else {
                thingsInTruck.add(item)
                println("Move your $item to the truck")
            }
        }
    }

    fun moveEverythingToNewPlace() {
        while (thingsInTruck.isNotEmpty()) {
            val item = thingsInTruck.removeAt(0)
            thingsInNewPlace.add(item)
            println("Moved your $item into your new place!")
        }
    }

    fun finishMove() {
        println("OK, we finished! We were able to move your: ${thingsInNewPlace.toBulletedList()}")
    }

    fun <T> List<T>.toBulletedList(): String {
        val separator = "\n - "
        return this.joinToString(separator, prefix = separator, postfix = "\n") { "$it" }
    }
}
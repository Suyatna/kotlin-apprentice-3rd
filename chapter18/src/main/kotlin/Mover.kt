class Mover<T: Checkable>(
    thingsToMove: List<T>,
    val truckHeightInInches: Int = (12 * 12)
) {
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()
    private var thingsWhichFailedCheck = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    fun moveEverythingToTruck() {
        while (thingsLeftInOldPlace.isNotEmpty()) {
            val item = thingsLeftInOldPlace.removeAt(0)

            if (item.checkIsOk()) {
                thingsInTruck.add(item)
                println("Moved your $item to the truck")
            } else {
                thingsWhichFailedCheck.add(item)
                println("Couldn't move your $item to the truck :[")
            }
        }
    }

    fun moveEverythingIntoNewPlace() {
        while (thingsInTruck.isNotEmpty()) {
            val item = thingsInTruck.removeAt(0)

            if (item.checkIsOk()) {
                thingsInNewPlace.add(item)
                println("Moved your $item into your new place!")
            } else {
                thingsWhichFailedCheck.add(item)
                println("Couldn't move your $item into your new place! :[")
            }
        }
    }

    fun finishMove() {
        println("OK, we finished! We were able to move your: ${thingsInNewPlace.toBulletedList()}")

        if (thingsWhichFailedCheck.isNotEmpty()) {
            println("But we need to talk about your: ${thingsWhichFailedCheck.toBulletedList()}")
        }
    }

    fun <T> List<T>.toBulletedList(): String {
        val separator = "\n - "
        return this.joinToString(separator, prefix = separator, postfix = "\n") { "$it" }
    }
}
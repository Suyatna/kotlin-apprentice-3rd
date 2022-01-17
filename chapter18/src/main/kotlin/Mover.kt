class Mover<T: Checkable>(
    thingsToMove: List<T>,
    val truckHeightInInches: Int = (12 * 12)
) {
    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<Any>()
    private var thingsInNewPlace = mutableListOf<T>()
    private var thingsWhichFailedCheck = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    fun moveEverythingToTruck(startingContainer: Container<T>?) {
        var currentContainer = startingContainer

        while (thingsLeftInOldPlace.isNotEmpty()) {
            val item = thingsLeftInOldPlace.removeAt(0)

            if (item.checkIsOk()) {
                thingsInTruck.add(item)
                println("Moved your $item to the truck")

                if (currentContainer != null) {

                }
            } else {
                thingsWhichFailedCheck.add(item)
                println("Couldn't move your $item to the truck :[")
            }
        }

        currentContainer?.let { moveContainerToTruck(it) }
    }

    fun moveContainerToTruck(container: Container<T>) {
        thingsInTruck.add(container)
        println("Moved a container with your ${container.contents().toBulletedList()} to the truck")
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
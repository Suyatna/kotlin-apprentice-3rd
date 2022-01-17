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
                if (currentContainer != null) {
                    if (!currentContainer.canAddAnotherItem()) {
                        moveContainerToTruck(currentContainer)
                        currentContainer = currentContainer.getAnother()
                    }

                    currentContainer.addItem(item)
                    println("Packed your $item")
                } else {
                    thingsInTruck.add(item)
                    println("Moved your $item to the truck!")
                }
            } else {
                thingsWhichFailedCheck.add(item)
                println("Couldn't move your $item to the truck :[")
            }
        }

        currentContainer?.let { moveContainerToTruck(it) }
    }

    private fun moveContainerToTruck(container: Container<T>) {
        thingsInTruck.add(container)
        println("Moved a container with your ${container.contents().toBulletedList()} to the truck")
    }

    fun moveEverythingIntoNewPlace() {
        val containers = thingsInTruck.filterIsInstance<Container<T>>()

        for (container in containers) {
            thingsInTruck.remove(container)

            while (container.canRemoveAnotherItem()) {
                val itemInContainer = container.removeItem()
                println("Unpacked your $itemInContainer")
                tryToMoveItemIntoNewPlace(itemInContainer)
            }
        }

        while (thingsInTruck.isNotEmpty()) {
            @Suppress("UNCHECKED_CAST")
            val item = thingsInTruck.removeAt(0) as? T
            if (item != null) {
                tryToMoveItemIntoNewPlace(item)
            } else {
                println("Something in the truck was not of the expected generic type: $item")
            }
        }

    }

    private fun tryToMoveItemIntoNewPlace(item: T) {
        if (item.checkIsOk()) {
            thingsInNewPlace.add(item)
            println("Moved your $item into your new place!")
        } else {
            thingsWhichFailedCheck.add(item)
            println("Couldn't move your $item into your new place! :[")
        }
    }

    fun finishMove() {
        println("OK, we finished! We were able to move your: ${thingsInNewPlace.toBulletedList()}")

        if (thingsWhichFailedCheck.isNotEmpty()) {
            println("But we need to talk about your: ${thingsWhichFailedCheck.toBulletedList()}")
        }
    }

    private fun <T> List<T>.toBulletedList(): String {
        val separator = "\n - "
        return this.joinToString(separator, prefix = separator, postfix = "\n") { "$it" }
    }
}

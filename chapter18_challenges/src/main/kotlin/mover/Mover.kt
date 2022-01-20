package mover

import `interface`.Checkable
import `interface`.Container

class Mover<T: Checkable>(
    thingsToMove: List<T>,
    private val truckHeightInInches: Int = (12 * 12)
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

            if (item.checkIsOK()) {
                if (currentContainer != null) {
                    if (!currentContainer.canAddAnotherItem()) {
                        moveContainerToTruck(currentContainer)
                        currentContainer = currentContainer.getAnother()
                    }

                    currentContainer.addItem(item)
                    println("Packed your $item")
                } else {
                    thingsInTruck.add(item)
                    println("Moved your $item to the truck")
                }
            } else {
                thingsWhichFailedCheck.add(item)
                println("Could not move your $item to the truck :[")
            }
        }

        currentContainer?.let { moveContainerToTruck(it) }
    }

    private fun moveContainerToTruck(currentContainer: Container<T>) {
        thingsInTruck.add(currentContainer)
        println("Moved a current container to the truck with your: ${currentContainer.contents().toBulletedList()}")
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
                println("Something in the truck was not of the expected generic type: null")
            }
        }
    }

    private fun tryToMoveItemIntoNewPlace(itemInContainer: T) {
        if (itemInContainer.checkIsOK()) {
            thingsInNewPlace.add(itemInContainer)
            println("Moved your $itemInContainer into your new place")
        } else {
            thingsWhichFailedCheck.add(itemInContainer)
            println("Could not move your $itemInContainer into new place :[")
        }
    }

    fun finishMove() {
        println("OK, we finished! We were able to move your: ${thingsInNewPlace.toBulletedList()}")

        if (thingsWhichFailedCheck.isNotEmpty()) {
            println("But we need to talk about your: ${thingsWhichFailedCheck.toBulletedList()}")
        }
    }

    fun fitsInTruck(itemHeight: Int): Boolean {
        return truckHeightInInches > itemHeight
    }

    private fun <T> List<T>.toBulletedList(): String {
        val separator = "\n - "
        return this.joinToString(separator, prefix = separator, postfix = "\n") { "$it" }
    }
}
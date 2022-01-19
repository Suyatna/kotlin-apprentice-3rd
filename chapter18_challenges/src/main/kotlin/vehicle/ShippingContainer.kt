package vehicle

import `interface`.Container

class ShippingContainer : Container<Vehicle> {

    var vehicle: Vehicle? = null

    override fun canAddAnotherItem(): Boolean {
        return vehicle == null
    }

    override fun addItem(item: Vehicle) {
        this.vehicle = item
    }

    override fun canRemoveAnotherItem(): Boolean {
        return vehicle != null
    }

    override fun removeItem(): Vehicle {
        val itemToReturn = vehicle!!
        vehicle = null
        return itemToReturn
    }

    override fun getAnother(): Container<Vehicle> {
        return ShippingContainer()
    }

    override fun contents(): List<Vehicle> {
        var list = mutableListOf<Vehicle>()
        vehicle?.let { list.add(it) }
        return list
    }
}
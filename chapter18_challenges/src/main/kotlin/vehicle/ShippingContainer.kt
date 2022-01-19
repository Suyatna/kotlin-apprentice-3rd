package vehicle

import `interface`.Container

class ShippingContainer : Container<Vehicle> {

    var vehicle: Vehicle? = null

    override fun canAddAnotherItem(): Boolean {
        TODO("Not yet implemented")
    }

    override fun addItem(item: Vehicle) {
        TODO("Not yet implemented")
    }

    override fun canRemoveAnotherItem(): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeItem(): Vehicle {
        TODO("Not yet implemented")
    }

    override fun getAnother(): Container<Vehicle> {
        TODO("Not yet implemented")
    }

    override fun contents(): List<Vehicle> {
        TODO("Not yet implemented")
    }
}
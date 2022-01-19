package vehicle

import `interface`.Checkable

class Vehicle(
    val brandName: String,
    val modelName: String,
    val heightInInches: Int
) : Checkable {

    var heightCheckFunction: ((Int) -> Boolean)? = null

    override fun checkIsOK(): Boolean {
        heightCheckFunction?.let { return it.invoke(heightInInches) }

        throw RuntimeException("You must provide a height check function!")
    }

    override fun toString(): String {
        return "$brandName $modelName"
    }
}
package mover

import `interface`.Checkable

class CheapThing(
    private val name: String
) : Checkable {
    override fun checkIsOK(): Boolean = true

    override fun toString(): String {
        return name
    }
}
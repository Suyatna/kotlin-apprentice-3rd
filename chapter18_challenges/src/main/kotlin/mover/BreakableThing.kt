package mover

import `interface`.Checkable

class BreakableThing(
    private val name: String,
    var isBroken: Boolean = false
) : Checkable {
    override fun checkIsOK(): Boolean {
        return !isBroken
    }

    override fun toString(): String {
        return name
    }

    fun smash() {
        isBroken = true
    }
}
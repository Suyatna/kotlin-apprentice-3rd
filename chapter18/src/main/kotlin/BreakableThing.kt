class BreakableThing(
    private val name: String,
    var isBroken: Boolean = false
) : Checkable {
    fun smash() {
        isBroken = true
    }

    override fun checkIsOk(): Boolean {
        return !isBroken
    }

    override fun toString(): String {
        return name
    }
}
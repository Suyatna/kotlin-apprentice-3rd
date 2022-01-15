class BreakableThing(
    private val name: String,
    var isBroken: Boolean = false
) {
    fun smash() {
        isBroken = true
    }

    override fun toString(): String {
        return name
    }
}
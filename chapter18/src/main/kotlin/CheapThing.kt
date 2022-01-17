class CheapThing(private val name: String) : Checkable {
    override fun checkIsOk(): Boolean = true

    override fun toString(): String {
        return name
    }
}
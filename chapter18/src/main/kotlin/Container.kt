interface Container<T> {
    fun canAddAnotherItem(): Boolean
    fun addItem(item: T)
    fun canRemoveAnotherItem(): Boolean
    fun removeItem(): T
    fun getAnother(): Container<T>
    fun contents(): List<T>
}
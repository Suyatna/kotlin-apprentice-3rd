class CardBoardBox : Container<BreakableThing> {
    private var items = mutableListOf<BreakableThing>()

    override fun canAddAnotherItem(): Boolean {
        return items.count() < 2
    }

    override fun addItem(item: BreakableThing) {
        items.add(item)
    }

    override fun canRemoveAnotherItem(): Boolean {
        return items.isNotEmpty()
    }

    override fun removeItem(): BreakableThing {
        val lastItem = items.last()
        items.remove(lastItem)
        return lastItem
    }

    override fun getAnother(): Container<BreakableThing> {
        return CardBoardBox()
    }

    override fun contents(): List<BreakableThing> {
        return items.toList()
    }
}
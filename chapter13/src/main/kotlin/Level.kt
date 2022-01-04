class Level(
    val id: Int,
    var boss: String,
    var unlocked: Boolean
) {
    companion object {
        @JvmStatic var highestLevel = 1
    }
}
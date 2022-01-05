import kotlin.properties.Delegates

class DelegatedLevel(val id: Int, var boss: String) {
    companion object {
        var highestLevel = 1
    }
    var unlocked: Boolean by Delegates.observable(false) {
        _, old, new ->
        if (new && id > highestLevel) {
            highestLevel = id
        }
        println("$old -> $new")
    }
}
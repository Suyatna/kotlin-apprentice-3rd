import java.util.*

class Robot(private val name: String) {
    var strength = 0

    private var health = 100

    private var random: Random = Random()

    var isAlive = true

    init {
        strength = random.randomStrength()
        report("Created (strength $strength)")
    }

    private fun report(message: String) {

    }

}
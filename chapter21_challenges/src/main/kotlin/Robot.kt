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
        println("$name: \t$message")
    }

    private fun damage(damage: Int) {
        val blocked = random.randomBlock()

        if (blocked) {
            report("Blocked attack")
            return
        }

        health -= damage
        report("Damage -$damage, health $health")

        if (health <= 0) {
            isAlive = false
        }
    }

    infix fun attack(robot: Robot) {
        val damage = random.randomDamage(strength)
        robot.damage(damage)
    }
}
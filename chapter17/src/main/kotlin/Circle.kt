import kotlin.math.PI

class Circle(private val radius: Double): Area {
    override val area: Double
        get() = PI * radius * radius
}
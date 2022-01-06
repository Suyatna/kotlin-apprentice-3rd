import kotlin.math.PI
import kotlin.math.sqrt

class Circle(private var radius: Double = 0.0) {
    var area: Double
        get() {
            return PI * radius * radius
        }
        set(value) {
            radius = sqrt(value / PI)
        }

    fun grow(factor: Double) {
        area *= 3
    }
}
import kotlin.math.atan

class Circle(var radius: Double = 0.0) {
    val pi: Double by lazy {
        ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0
    }
    val circumference: Double
        get() = pi * radius * 2
}
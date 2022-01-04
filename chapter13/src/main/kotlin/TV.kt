import kotlin.math.roundToInt
import kotlin.math.sqrt

class TV(var height: Double, var width: Double) {
    var diagonal: Int
        get() {
            val result = sqrt(height * height + width * width)
            return result.roundToInt()
        }
        set(value) {
            val ratioWidth = 16.0
            val ratioHeight = 9.0

            val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            height = value.toDouble() * ratioHeight / ratioDiagonal
            width = height * ratioWidth / ratioHeight
        }
}
class Triangle(private val base: Double, private val height: Double): Area {
    override val area: Double
        get() = 0.5 * base * height
}
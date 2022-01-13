class Square(private val side: Double): Area {
    override val area: Double
        get() = side * side
}
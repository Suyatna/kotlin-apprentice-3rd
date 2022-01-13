fun main() {
    val car = OptionalDirection()
    car.turn() // > LEFT
    car.turn(Direction.RIGHT) // > RIGHT
    println()

    val falcon = LightFreighter()
    falcon.accelerate() // > Proceed to hyperspace!
    falcon.stop() // > Whoa, slow down!
    println()

    val enterprise = Starship()
    enterprise.accelerate() // > Warp factor 9 please!
    enterprise.stop()
    // > Whoa, slow down!
    // > That kind of hurt!
    println()

    val carProperties = Car()
    println(carProperties.weight)
    println(carProperties.name)
    println()

    val tank = Tank()
    println(tank.weight)
    println(tank.name)
    println()

    val square = Square(4.0)
    val triangle = Triangle(3.0, 5.0)
    val circle = Circle(2.0)
    val shapes = arrayOf(square, triangle, circle)
    println(shapes.map { it.area })
}
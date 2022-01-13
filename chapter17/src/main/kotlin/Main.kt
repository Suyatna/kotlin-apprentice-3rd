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
    println()

    val cars = listOf("Lamborghini", "Ferrari", "Rolls-Royce")
    val numbers = mapOf("Brady" to 12, "Manning" to 18, "Brees" to 9)

    for (car in cars) {
        println(car)
    }

    for (qb in numbers) {
        println("${qb.key} wears ${qb.value}")
    }
    println()

    val titanic = Boat()
    titanic.length = 883

    val qe2 = Boat()
    qe2.length = 963

    println(titanic > qe2) // > false
}
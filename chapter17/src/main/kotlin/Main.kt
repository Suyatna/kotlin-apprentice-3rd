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
}
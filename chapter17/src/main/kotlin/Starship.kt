class Starship: SpaceVehicle {
    override fun accelerate() {
        println("Warp factor 9 please!")
    }

    override fun stop() {
        super.stop()
        println("That kind of hurt!")
    }
}
interface DirectionalVehicle {
    fun accelerate()
    fun stop()
    fun turn(direction: Direction)
    fun description(): String
}